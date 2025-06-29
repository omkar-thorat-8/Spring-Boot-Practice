package com.practice.IPLTeams_Day03;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {
	
	@GetMapping("/home")
	public String home() {
	    return "Welcome to IPL Teams API!";
	}

	@GetMapping("/teams/{teamName}")
	public ArrayList<IplTeams> iplTeam(@PathVariable String teamName) {
		
		ArrayList<IplTeams> list = new ArrayList<>();
		
		if(teamName.equals("RCB")) {
			
			list.add(new IplTeams("MI",1,"Virat"));
		}
		else if(teamName.equals("MI")) {
			
			list.add(new IplTeams("MI",1,"Rohit"));
		}
		else if(teamName.equals("CSK")) {
			
			list.add(new IplTeams("CSK",1,"Dhoni"));
		}
		
		return list;
	}
}
