package com.practice.EmployeeRestAPI_Day02;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/data/{name}")
	public ArrayList<Employee> getData(@PathVariable String name) {
		
		
		ArrayList<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(101,"Ankit");
		Employee e2 = new Employee(102,"Prem");
		Employee e3 = new Employee(103,"Rajuu");
		Employee e4 = new Employee(104,"Shubham");
		Employee e5 = new Employee(105,"Yash");
		Employee e6 = new Employee(105,name);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		return list;
	}
}
