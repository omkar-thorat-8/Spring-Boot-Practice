package com.practice.Room_Day04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		
		return "Hello this is My project to know about PostMan";
	}
}
