package com.salmon.sde.reportfetcher.data;

public class ReportResponse
{
	private String reportId;
	private String recordType;
	private String status;
	private String statusDetails;
	private String location;
	private String fileSize;

	public String getReportId()
	{
		return reportId;
	}

	public void setReportId(final String reportId)
	{
		this.reportId = reportId;
	}

	public String getRecordType()
	{
		return recordType;
	}

	public void setRecordType(final String recordType)
	{
		this.recordType = recordType;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(final String status)
	{
		this.status = status;
	}

	public String getStatusDetails()
	{
		return statusDetails;
	}

	public void setStatusDetails(final String statusDetails)
	{
		this.statusDetails = statusDetails;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(final String location)
	{
		this.location = location;
	}

	public String getFileSize()
	{
		return fileSize;
	}

	public void setFileSize(final String fileSize)
	{
		this.fileSize = fileSize;
	}
}
