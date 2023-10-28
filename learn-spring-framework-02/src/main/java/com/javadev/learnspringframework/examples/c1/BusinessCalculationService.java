package com.javadev.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

	DataService service;

	public BusinessCalculationService(DataService service) {
		this.service = service;
	}

	public int findMax() {
		return Arrays.stream(service.retrieveData()).max().orElse(0);
	}

}
