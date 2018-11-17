package com.salmon.sde.reportfetcher.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salmon.sde.reportfetcher.service.ReportService;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ServiceConfig
{
	@Bean
	@ConfigurationProperties(prefix = "reportfetcher.amazon")
	public AmazonEndpointConfig reportFetcherConfig()
	{
		return new AmazonEndpointConfig();
	}

	@Bean
	public ReportService reportService(final AmazonEndpointConfig amazonEndpointConfig, final RestTemplate amazonRestTemplate, final ObjectMapper objectMapper)
	{
		return new ReportService(amazonEndpointConfig, amazonRestTemplate, objectMapper);
	}

	@Bean
	public RestTemplate amazonRestTemplate(final HttpComponentsClientHttpRequestFactory amazonRequestFactory)
	{
		return new RestTemplate(amazonRequestFactory);
	}

	@Bean
	public HttpComponentsClientHttpRequestFactory amazonRequestFactory()
	{
		return new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create()
						.setRedirectStrategy(new RedirectStrategy()
						{
							@Override
							public boolean isRedirected(final HttpRequest request, final HttpResponse response, final HttpContext context) throws ProtocolException
							{
								return false;
							}

							@Override
							public HttpUriRequest getRedirect(final HttpRequest request, final HttpResponse response, final HttpContext context) throws ProtocolException
							{
								return null;
							}
						}).build());
	}
}
