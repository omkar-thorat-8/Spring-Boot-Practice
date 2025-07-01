package com.practice.SpringBootMVC_Day05.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.SpringBootMVC_Day05.model.Product;

@Service
public class ProductService {

	List<Product> list = new ArrayList<Product>();
	
	public List<Product> getAllProducts() {
		
		list.add(new Product(101, "Iphone"));
		list.add(new Product(102, "Redmi"));
		list.add(new Product(103, "IQOO"));

		return list;
	}
}
