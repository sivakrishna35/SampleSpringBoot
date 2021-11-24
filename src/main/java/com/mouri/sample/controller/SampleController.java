package com.mouri.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/getMsg")
	public String getMessage() {
		System.out.println("added sop through git");
		return "Hello Siva Welcome to Mouritech";
	}

}
