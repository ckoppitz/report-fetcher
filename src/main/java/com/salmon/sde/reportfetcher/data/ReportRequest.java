package com.salmon.sde.reportfetcher.data;

public class ReportRequest
{
	//private String segment;
	private String reportDate;
	private String metrics;

	public String getReportDate()
	{
		return reportDate;
	}

	public void setReportDate(final String reportDate)
	{
		this.reportDate = reportDate;
	}

	public String getMetrics()
	{
		return metrics;
	}

	public void setMetrics(final String metrics)
	{
		this.metrics = metrics;
	}
}
