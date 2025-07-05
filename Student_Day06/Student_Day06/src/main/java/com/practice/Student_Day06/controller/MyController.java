package com.practice.Student_Day06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Student_Day06.model.Student;
import com.practice.Student_Day06.service.StudentService;

@Controller
public class MyController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("stud", studentService.getData());
		
		return "student";
	}
	
}
