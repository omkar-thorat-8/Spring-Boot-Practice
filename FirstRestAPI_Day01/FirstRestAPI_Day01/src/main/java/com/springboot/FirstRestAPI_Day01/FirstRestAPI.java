package com.springboot.FirstRestAPI_Day01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestAPI {

	@GetMapping("/data")
	public String getData() {
		
		return "This is App Data";
	}
}
