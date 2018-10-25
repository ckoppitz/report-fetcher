package com.salmon.sde.reportfetcher.controllers;

import com.salmon.sde.reportfetcher.data.AdGroupReport;
import com.salmon.sde.reportfetcher.repositories.AdGroupReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@Autowired
	private AdGroupReportRepository adGroupReportRepository;

	@RequestMapping("/foo")
	public String Home()
	{
		final AdGroupReport adGroupReport = new AdGroupReport();
		adGroupReport.setAdGroupName("Foo");
		adGroupReportRepository.save(adGroupReport);
		return "Done";
	}

}
