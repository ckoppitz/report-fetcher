package com.salmon.sde.reportfetcher.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@RequestMapping("/")
	public String Home()
	{
		return "Hello World";
	}

}
