package com.practice.IPLTeams_Day03;

import org.springframework.stereotype.Component;

@Component
public class IplTeams {

	String name;
	int trophies;
	String captainName;
	
	public IplTeams() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IplTeams(String name, int trophies, String captainName) {
		super();
		this.name = name;
		this.trophies = trophies;
		this.captainName = captainName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	
	
}
