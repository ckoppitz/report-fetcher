package com.salmon.sde.reportfetcher.controllers;

import com.salmon.sde.reportfetcher.entities.CampaignReportLine;
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

	private static final String CAMPAIGN_REPORT_METRICS = "bidPlus,campaignName,campaignId,campaignStatus,campaignBudget,impressions,clicks,cost," +
			"attributedConversions1d,attributedConversions7d,attributedConversions14d,attributedConversions30d," +
			"attributedConversions1dSameSKU,attributedConversions7dSameSKU,attributedConversions14dSameSKU,attributedConversions30dSameSKU," +
			"attributedUnitsOrdered1d,attributedUnitsOrdered7d,attributedUnitsOrdered14d,attributedUnitsOrdered30d," +
			"attributedSales1d,attributedSales7d,attributedSales14d,attributedSales30d," +
			"attributedSales1dSameSKU,attributedSales7dSameSKU,attributedSales14dSameSKU,attributedSales30dSameSKU";

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

	@RequestMapping("/generate/campaigns")
	public String FetchReport(@RequestParam(required = true, name = "date") final String date) throws Exception
	{
		return reportService.fetchReport("/v2/sp/campaigns/report", date, campaignReportLineRepository, CampaignReportLine[].class);
	}
}
