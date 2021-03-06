package com.salmon.sde.reportfetcher.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salmon.sde.reportfetcher.config.AmazonEndpointConfig;
import com.salmon.sde.reportfetcher.data.ReportRequest;
import com.salmon.sde.reportfetcher.data.ReportResponse;
import com.salmon.sde.reportfetcher.entities.AbstractReportLine;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class ReportService
{
	private static final Logger LOG = LoggerFactory.getLogger(ReportService.class);
	private static final String SUCCESS = "SUCCESS";
	private static final int SLEEP_TIME = 50;

	private final AmazonEndpointConfig amazonEndpointConfig;
	private final RestTemplate amazonRestTemplate;
	private final ObjectMapper objectMapper;

	public ReportService(final AmazonEndpointConfig amazonEndpointConfig, final RestTemplate amazonRestTemplate, final ObjectMapper objectMapper)
	{
		this.amazonEndpointConfig = amazonEndpointConfig;
		this.amazonRestTemplate = amazonRestTemplate;
		this.objectMapper = objectMapper;
	}

	public <T extends AbstractReportLine> String fetchReport(final String reportCreationEndpoint, final String metrics, final String date, final JpaRepository<T, Long> repository, final Class<T[]> reportType) throws Exception
	{
		LOG.info("Fetching report for time '{}'.", date);
		final HttpEntity<ReportRequest> entity = createEntityForRequest(createRequest(date, metrics));
		final ResponseEntity<String> reportCreationResponse = amazonRestTemplate.exchange(amazonEndpointConfig.getEndpoint() + reportCreationEndpoint, HttpMethod.POST, entity, String.class);

		ReportResponse reportMetadata = processResponse(reportCreationResponse);
		final String reportId = reportMetadata.getReportId();

		while (!SUCCESS.equalsIgnoreCase(reportMetadata.getStatus()))
		{
			LOG.info("Report '{}' status '{}'. Sleeping and retrying...", reportId, reportMetadata.getStatus());
			Thread.sleep(SLEEP_TIME);
			final ResponseEntity<String> reportStatusResponse = amazonRestTemplate.exchange(amazonEndpointConfig.getEndpoint() + "/v2/reports/" + reportId, HttpMethod.GET, createEntityForRequest(null), String.class);
			reportMetadata = processResponse(reportStatusResponse);
		}

		LOG.info("Looking up report '{}' location at '{}'...", reportId, reportMetadata.getLocation());
		final ResponseEntity<String> reportLocationResponse = amazonRestTemplate.exchange(reportMetadata.getLocation(), HttpMethod.GET, createEntityForRequest(null), String.class);
		final URI reportLocation = reportLocationResponse.getHeaders().getLocation();

		if (reportLocationResponse.getStatusCode() == HttpStatus.TEMPORARY_REDIRECT && reportLocation != null)
		{
			LOG.info("Downloading report '{}' from '{}'...", reportId, reportLocation);
			final byte[] rawReport = amazonRestTemplate.getForObject(reportLocation, byte[].class);

			if (ArrayUtils.isNotEmpty(rawReport))
			{
				final String stringReport = IOUtils.toString(new GZIPInputStream(new ByteArrayInputStream(rawReport)), Charset.forName("UTF-8"));
				LOG.debug("Received report: {}", stringReport);

				T[] report = objectMapper.readValue(stringReport, reportType);
				addLineNumbers(reportId, report);
				repository.saveAll(Arrays.asList(report));
				return stringReport;
			}
		}

		return "Error.";
	}

	private <T extends AbstractReportLine> void addLineNumbers(final String reportId, final T[] report)
	{
		for (int i = 0; i < report.length; i++)
		{
			report[i].setReportId(reportId);
			report[i].setLineNumber(Long.valueOf(i));
		}
	}


	private ReportRequest createRequest(final String date, final String metrics)
	{
		final ReportRequest reportRequest = new ReportRequest();
		reportRequest.setReportDate(date);
		reportRequest.setMetrics(metrics);
		return reportRequest;
	}

	private ReportResponse processResponse(ResponseEntity<String> response) throws IOException
	{
		LOG.info("Received HTTP {}: {}", response.getStatusCode().value(), response.getBody());

		if (response.getStatusCode().is2xxSuccessful())
		{
			return objectMapper.readValue(response.getBody(), ReportResponse.class);
		}

		throw new RuntimeException("Error occurred.");
	}

	private <T> HttpEntity<T> createEntityForRequest(final T request)
	{
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Amazon-Advertising-API-ClientId", amazonEndpointConfig.getClientId());
		headers.add("Amazon-Advertising-API-Scope", amazonEndpointConfig.getScope());
		headers.add("Authorization", "Bearer " + amazonEndpointConfig.getAuthorization());
		return new HttpEntity<>(request, headers);
	}
}

