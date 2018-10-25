package com.salmon.sde.reportfetcher.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SponsoredBrandsReport
{
	@Id
	@GeneratedValue
	private Long id;
	private String campaignName;
	private String campaignId;
	private String campaignStatus;
	private String campaignBudget;
	private String campaignBudgetType;
	private String adGroupName;
	private String adGroupId;
	private String keywordText;
	private String matchType;
	private String impressions;
	private String clicks;
	private String cost;
	private String attributedSales14d;
	private String attributedSales14dSameSKU;
	private String attributedConversions14d;

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

	public String getCampaignStatus()
	{
		return campaignStatus;
	}

	public void setCampaignStatus(final String campaignStatus)
	{
		this.campaignStatus = campaignStatus;
	}

	public String getCampaignBudget()
	{
		return campaignBudget;
	}

	public void setCampaignBudget(final String campaignBudget)
	{
		this.campaignBudget = campaignBudget;
	}

	public String getCampaignBudgetType()
	{
		return campaignBudgetType;
	}

	public void setCampaignBudgetType(final String campaignBudgetType)
	{
		this.campaignBudgetType = campaignBudgetType;
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

	public String getKeywordText()
	{
		return keywordText;
	}

	public void setKeywordText(final String keywordText)
	{
		this.keywordText = keywordText;
	}

	public String getMatchType()
	{
		return matchType;
	}

	public void setMatchType(final String matchType)
	{
		this.matchType = matchType;
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

	public String getAttributedSales14d()
	{
		return attributedSales14d;
	}

	public void setAttributedSales14d(final String attributedSales14d)
	{
		this.attributedSales14d = attributedSales14d;
	}

	public String getAttributedSales14dSameSKU()
	{
		return attributedSales14dSameSKU;
	}

	public void setAttributedSales14dSameSKU(final String attributedSales14dSameSKU)
	{
		this.attributedSales14dSameSKU = attributedSales14dSameSKU;
	}

	public String getAttributedConversions14d()
	{
		return attributedConversions14d;
	}

	public void setAttributedConversions14d(final String attributedConversions14d)
	{
		this.attributedConversions14d = attributedConversions14d;
	}
}
