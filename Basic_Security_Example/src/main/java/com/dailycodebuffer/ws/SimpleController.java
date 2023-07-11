package com.dailycodebuffer.ws;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class SimpleController {
	
//	Logger logger = Logger.getLogger(SimpleController.class);
	Logger logger = LogManager.getLogger(SimpleController.class);
	
	@GetMapping("/")
	public String home() {
		logger.info("hey dear logger is working properly");
		return "Welcome to daily code buffer";
	}
	//spring.boot.ws
}
