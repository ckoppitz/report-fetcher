package com.salmon.sde.reportfetcher.config;

public class AmazonEndpointConfig
{
	private String clientId;
	private String scope;
	private String authorization;
	private String endpoint;

	public String getClientId()
	{
		return clientId;
	}

	public void setClientId(final String clientId)
	{
		this.clientId = clientId;
	}

	public String getScope()
	{
		return scope;
	}

	public void setScope(final String scope)
	{
		this.scope = scope;
	}

	public String getAuthorization()
	{
		return authorization;
	}

	public void setAuthorization(final String authorization)
	{
		this.authorization = authorization;
	}

	public String getEndpoint()
	{
		return endpoint;
	}

	public void setEndpoint(final String endpoint)
	{
		this.endpoint = endpoint;
	}
}
