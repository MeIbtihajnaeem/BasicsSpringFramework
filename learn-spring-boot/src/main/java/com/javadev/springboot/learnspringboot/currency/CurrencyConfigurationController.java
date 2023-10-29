package com.javadev.springboot.learnspringboot.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	CurrencyConfiguration configuration;

	@RequestMapping("/currency-config")
	public CurrencyConfiguration retrieveCurrencyConfiguration() {
		return configuration;
	}
}
