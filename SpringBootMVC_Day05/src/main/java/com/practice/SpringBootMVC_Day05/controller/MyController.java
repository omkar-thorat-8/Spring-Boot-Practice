package com.practice.SpringBootMVC_Day05.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.practice.SpringBootMVC_Day05.service.ProductService;

@Controller
public class MyController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public String ProductDetails(Model model) {
		
		model.addAttribute("prod",productService.getAllProducts());
		
		return "products";
	}
	
	
}
