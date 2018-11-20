package com.salmon.sde.reportfetcher.controllers;

import com.salmon.sde.reportfetcher.entities.AsinReportLine;
import com.salmon.sde.reportfetcher.entities.CampaignReportLine;
import com.salmon.sde.reportfetcher.entities.KeywordReportLine;
import com.salmon.sde.reportfetcher.service.ReportService;
import com.salmon.sde.reportfetcher.repositories.AsinReportLineRepository;
import com.salmon.sde.reportfetcher.repositories.CampaignReportLineRepository;
import com.salmon.sde.reportfetcher.repositories.KeywordReportLineRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController
{
	private static final Logger LOG = LoggerFactory.getLogger(ReportController.class);

	private final AsinReportLineRepository asinReportLineRepository;
	private final CampaignReportLineRepository campaignReportLineRepository;
	private final KeywordReportLineRepository keywordReportLineRepository;

	private final ReportService reportService;


	public ReportController(final AsinReportLineRepository asinReportLineRepository, final CampaignReportLineRepository campaignReportLineRepository, final KeywordReportLineRepository keywordReportLineRepository, final ReportService reportService)
	{
		this.asinReportLineRepository = asinReportLineRepository;
		this.campaignReportLineRepository = campaignReportLineRepository;
		this.keywordReportLineRepository = keywordReportLineRepository;
		this.reportService = reportService;
	}

	@RequestMapping("/generate/sponsored-products/campaigns")
	public String generateSPCampaignsReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/sp/campaigns/report", CampaignReportLine.METRICS, date, campaignReportLineRepository, CampaignReportLine[].class);
	}

	@RequestMapping("/generate/sponsored-products/keywords")
	public String generateSPKeywordReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/sp/keywords/report", KeywordReportLine.METRICS, date, keywordReportLineRepository, KeywordReportLine[].class);
	}

	@RequestMapping("/generate/sponsored-products/asins")
	public String generateSPAsinsReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/sp/asins/report", AsinReportLine.METRICS, date, asinReportLineRepository, AsinReportLine[].class);
	}

	@RequestMapping("/generate/sponsored-brands/campaigns")
	public String generateSBCampaignsReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/hsa/campaigns/report", CampaignReportLine.METRICS, date, campaignReportLineRepository, CampaignReportLine[].class);
	}

	@RequestMapping("/generate/sponsored-brands/keywords")
	public String generateSBKeywordReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/hsa/keywords/report", KeywordReportLine.METRICS, date, keywordReportLineRepository, KeywordReportLine[].class);
	}

	@RequestMapping("/generate/sponsored-brands/asins")
	public String generateSBAsinsReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/hsa/asins/report", AsinReportLine.METRICS, date, asinReportLineRepository, AsinReportLine[].class);
	}
}
