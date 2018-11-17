package com.salmon.sde.reportfetcher.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractReportLine
{
	@Id
	@GeneratedValue
	private Long id;
	private String reportId;
	private Long lineNumber;

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getReportId()
	{
		return reportId;
	}

	public void setReportId(final String reportId)
	{
		this.reportId = reportId;
	}

	public Long getLineNumber()
	{
		return lineNumber;
	}

	public void setLineNumber(final Long lineNumber)
	{
		this.lineNumber = lineNumber;
	}
}
