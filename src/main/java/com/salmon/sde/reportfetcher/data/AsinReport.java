package com.salmon.sde.reportfetcher.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AsinReport
{
	@Id
	@GeneratedValue
	private Long id;
	private String campaignName;
	private String campaignId;
	private String adGroupName;
	private String adGroupId;
	private String keywordId;
	private String keywordText;
	private String asin;
	private String otherAsin;
	private String sku;
	private String currency;
	private String matchType;
	private String attributedUnitsOrdered1dOtherSKU;
	private String attributedUnitsOrdered7dOtherSKU;
	private String attributedUnitsOrdered14dOtherSKU;
	private String attributedUnitsOrdered30dOtherSKU;
	private String attributedSales1dOtherSKU;
	private String attributedSales7dOtherSKU;
	private String attributedSales14dOtherSKU;
	private String attributedSales30dOtherSKU;

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

	public String getKeywordId()
	{
		return keywordId;
	}

	public void setKeywordId(final String keywordId)
	{
		this.keywordId = keywordId;
	}

	public String getKeywordText()
	{
		return keywordText;
	}

	public void setKeywordText(final String keywordText)
	{
		this.keywordText = keywordText;
	}

	public String getAsin()
	{
		return asin;
	}

	public void setAsin(final String asin)
	{
		this.asin = asin;
	}

	public String getOtherAsin()
	{
		return otherAsin;
	}

	public void setOtherAsin(final String otherAsin)
	{
		this.otherAsin = otherAsin;
	}

	public String getSku()
	{
		return sku;
	}

	public void setSku(final String sku)
	{
		this.sku = sku;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

	public String getMatchType()
	{
		return matchType;
	}

	public void setMatchType(final String matchType)
	{
		this.matchType = matchType;
	}

	public String getAttributedUnitsOrdered1dOtherSKU()
	{
		return attributedUnitsOrdered1dOtherSKU;
	}

	public void setAttributedUnitsOrdered1dOtherSKU(final String attributedUnitsOrdered1dOtherSKU)
	{
		this.attributedUnitsOrdered1dOtherSKU = attributedUnitsOrdered1dOtherSKU;
	}

	public String getAttributedUnitsOrdered7dOtherSKU()
	{
		return attributedUnitsOrdered7dOtherSKU;
	}

	public void setAttributedUnitsOrdered7dOtherSKU(final String attributedUnitsOrdered7dOtherSKU)
	{
		this.attributedUnitsOrdered7dOtherSKU = attributedUnitsOrdered7dOtherSKU;
	}

	public String getAttributedUnitsOrdered14dOtherSKU()
	{
		return attributedUnitsOrdered14dOtherSKU;
	}

	public void setAttributedUnitsOrdered14dOtherSKU(final String attributedUnitsOrdered14dOtherSKU)
	{
		this.attributedUnitsOrdered14dOtherSKU = attributedUnitsOrdered14dOtherSKU;
	}

	public String getAttributedUnitsOrdered30dOtherSKU()
	{
		return attributedUnitsOrdered30dOtherSKU;
	}

	public void setAttributedUnitsOrdered30dOtherSKU(final String attributedUnitsOrdered30dOtherSKU)
	{
		this.attributedUnitsOrdered30dOtherSKU = attributedUnitsOrdered30dOtherSKU;
	}

	public String getAttributedSales1dOtherSKU()
	{
		return attributedSales1dOtherSKU;
	}

	public void setAttributedSales1dOtherSKU(final String attributedSales1dOtherSKU)
	{
		this.attributedSales1dOtherSKU = attributedSales1dOtherSKU;
	}

	public String getAttributedSales7dOtherSKU()
	{
		return attributedSales7dOtherSKU;
	}

	public void setAttributedSales7dOtherSKU(final String attributedSales7dOtherSKU)
	{
		this.attributedSales7dOtherSKU = attributedSales7dOtherSKU;
	}

	public String getAttributedSales14dOtherSKU()
	{
		return attributedSales14dOtherSKU;
	}

	public void setAttributedSales14dOtherSKU(final String attributedSales14dOtherSKU)
	{
		this.attributedSales14dOtherSKU = attributedSales14dOtherSKU;
	}

	public String getAttributedSales30dOtherSKU()
	{
		return attributedSales30dOtherSKU;
	}

	public void setAttributedSales30dOtherSKU(final String attributedSales30dOtherSKU)
	{
		this.attributedSales30dOtherSKU = attributedSales30dOtherSKU;
	}
}
