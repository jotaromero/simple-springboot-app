package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/property")
public class ValuePropertyController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Value("${configuration.property.value:default value}")
	private String springProperty;

	@GetMapping
	public String getPropertyFromConfiguration() {
		String message = String.format("Value obtained from application.yml file is -> %s", springProperty);
		log.info("getPropertyFromConfiguration method called: {}", message);
		return message;
	}
}
