package com.app.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbpController {
	
	@GetMapping("/")
	public String getInfo() {
		return "hi muthu";
		
	}
}
