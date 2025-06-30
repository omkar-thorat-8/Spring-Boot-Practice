package com.practice.Room_Day04;

import org.springframework.stereotype.Component;

@Component
public class Desk {

	String type;
	String colour;
	String company;
	
	public Desk(String type, String colour, String company) {
		super();
		this.type = type;
		this.colour = colour;
		this.company = company;
		
		System.err.println("Desk Parameterize Constructor Called..");
	}
	public Desk() {
		super();
		// TODO Auto-generated constructor stub
		
		System.err.println("Desk Default Constructor Called..");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
