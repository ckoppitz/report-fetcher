package com.salmon.sde.reportfetcher.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AdGroupReport
{
	@Id
	@GeneratedValue
	private Long id;
	private String campaignName;
	private String campaignId;
	private String adGroupName;
	private String adGroupId;
	private String impressions;
	private String clicks;
	private String cost;
	private String attributedConversions1d;
	private String attributedConversions7d;
	private String attributedConversions14d;
	private String attributedConversions30d;
	private String attributedConversions1dSameSKU;
	private String attributedConversions7dSameSKU;
	private String attributedConversions14dSameSKU;
	private String attributedConversions30dSameSKU;
	private String attributedUnitsOrdered1d;
	private String attributedUnitsOrdered7d;
	private String attributedUnitsOrdered14d;
	private String attributedUnitsOrdered30d;
	private String attributedSales1d;
	private String attributedSales7d;
	private String attributedSales14d;
	private String attributedSales30d;
	private String attributedSales1dSameSKU;
	private String attributedSales7dSameSKU;
	private String attributedSales14dSameSKU;
	private String attributedSales30dSameSKU;

	public Long getId()
	{
		return id;
	}

	public void setId(final Long id)
	{
		this.id = id;
	}

	public String getCampaignName()
	{
		return campaignName;
	}

	public void setCampaignName(final String campaignName)
	{
		this.campaignName = campaignName;
	}

	public String getCampaignId()
	{
		return campaignId;
	}

	public void setCampaignId(final String campaignId)
	{
		this.campaignId = campaignId;
	}

	public String getAdGroupName()
	{
		return adGroupName;
	}

	public void setAdGroupName(final String adGroupName)
	{
		this.adGroupName = adGroupName;
	}

	public String getAdGroupId()
	{
		return adGroupId;
	}

	public void setAdGroupId(final String adGroupId)
	{
		this.adGroupId = adGroupId;
	}

	public String getImpressions()
	{
		return impressions;
	}

	public void setImpressions(final String impressions)
	{
		this.impressions = impressions;
	}

	public String getClicks()
	{
		return clicks;
	}

	public void setClicks(final String clicks)
	{
		this.clicks = clicks;
	}

	public String getCost()
	{
		return cost;
	}

	public void setCost(final String cost)
	{
		this.cost = cost;
	}

	public String getAttributedConversions1d()
	{
		return attributedConversions1d;
	}

	public void setAttributedConversions1d(final String attributedConversions1d)
	{
		this.attributedConversions1d = attributedConversions1d;
	}

	public String getAttributedConversions7d()
	{
		return attributedConversions7d;
	}

	public void setAttributedConversions7d(final String attributedConversions7d)
	{
		this.attributedConversions7d = attributedConversions7d;
	}

	public String getAttributedConversions14d()
	{
		return attributedConversions14d;
	}

	public void setAttributedConversions14d(final String attributedConversions14d)
	{
		this.attributedConversions14d = attributedConversions14d;
	}

	public String getAttributedConversions30d()
	{
		return attributedConversions30d;
	}

	public void setAttributedConversions30d(final String attributedConversions30d)
	{
		this.attributedConversions30d = attributedConversions30d;
	}

	public String getAttributedConversions1dSameSKU()
	{
		return attributedConversions1dSameSKU;
	}

	public void setAttributedConversions1dSameSKU(final String attributedConversions1dSameSKU)
	{
		this.attributedConversions1dSameSKU = attributedConversions1dSameSKU;
	}

	public String getAttributedConversions7dSameSKU()
	{
		return attributedConversions7dSameSKU;
	}

	public void setAttributedConversions7dSameSKU(final String attributedConversions7dSameSKU)
	{
		this.attributedConversions7dSameSKU = attributedConversions7dSameSKU;
	}

	public String getAttributedConversions14dSameSKU()
	{
		return attributedConversions14dSameSKU;
	}

	public void setAttributedConversions14dSameSKU(final String attributedConversions14dSameSKU)
	{
		this.attributedConversions14dSameSKU = attributedConversions14dSameSKU;
	}

	public String getAttributedConversions30dSameSKU()
	{
		return attributedConversions30dSameSKU;
	}

	public void setAttributedConversions30dSameSKU(final String attributedConversions30dSameSKU)
	{
		this.attributedConversions30dSameSKU = attributedConversions30dSameSKU;
	}

	public String getAttributedUnitsOrdered1d()
	{
		return attributedUnitsOrdered1d;
	}

	public void setAttributedUnitsOrdered1d(final String attributedUnitsOrdered1d)
	{
		this.attributedUnitsOrdered1d = attributedUnitsOrdered1d;
	}

	public String getAttributedUnitsOrdered7d()
	{
		return attributedUnitsOrdered7d;
	}

	public void setAttributedUnitsOrdered7d(final String attributedUnitsOrdered7d)
	{
		this.attributedUnitsOrdered7d = attributedUnitsOrdered7d;
	}

	public String getAttributedUnitsOrdered14d()
	{
		return attributedUnitsOrdered14d;
	}

	public void setAttributedUnitsOrdered14d(final String attributedUnitsOrdered14d)
	{
		this.attributedUnitsOrdered14d = attributedUnitsOrdered14d;
	}

	public String getAttributedUnitsOrdered30d()
	{
		return attributedUnitsOrdered30d;
	}

	public void setAttributedUnitsOrdered30d(final String attributedUnitsOrdered30d)
	{
		this.attributedUnitsOrdered30d = attributedUnitsOrdered30d;
	}

	public String getAttributedSales1d()
	{
		return attributedSales1d;
	}

	public void setAttributedSales1d(final String attributedSales1d)
	{
		this.attributedSales1d = attributedSales1d;
	}

	public String getAttributedSales7d()
	{
		return attributedSales7d;
	}

	public void setAttributedSales7d(final String attributedSales7d)
	{
		this.attributedSales7d = attributedSales7d;
	}

	public String getAttributedSales14d()
	{
		return attributedSales14d;
	}

	public void setAttributedSales14d(final String attributedSales14d)
	{
		this.attributedSales14d = attributedSales14d;
	}

	public String getAttributedSales30d()
	{
		return attributedSales30d;
	}

	public void setAttributedSales30d(final String attributedSales30d)
	{
		this.attributedSales30d = attributedSales30d;
	}

	public String getAttributedSales1dSameSKU()
	{
		return attributedSales1dSameSKU;
	}

	public void setAttributedSales1dSameSKU(final String attributedSales1dSameSKU)
	{
		this.attributedSales1dSameSKU = attributedSales1dSameSKU;
	}

	public String getAttributedSales7dSameSKU()
	{
		return attributedSales7dSameSKU;
	}

	public void setAttributedSales7dSameSKU(final String attributedSales7dSameSKU)
	{
		this.attributedSales7dSameSKU = attributedSales7dSameSKU;
	}

	public String getAttributedSales14dSameSKU()
	{
		return attributedSales14dSameSKU;
	}

	public void setAttributedSales14dSameSKU(final String attributedSales14dSameSKU)
	{
		this.attributedSales14dSameSKU = attributedSales14dSameSKU;
	}

	public String getAttributedSales30dSameSKU()
	{
		return attributedSales30dSameSKU;
	}

	public void setAttributedSales30dSameSKU(final String attributedSales30dSameSKU)
	{
		this.attributedSales30dSameSKU = attributedSales30dSameSKU;
	}
}
