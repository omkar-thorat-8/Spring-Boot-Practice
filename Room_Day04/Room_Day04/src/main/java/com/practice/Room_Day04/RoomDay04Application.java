package com.practice.Room_Day04;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.practice.Room_Day04","com.table"})
@ComponentScans({@ComponentScan("com.books"),@ComponentScan("com.pen")})
public class RoomDay04Application {

	public static void main(String[] args) {
	 	ConfigurableApplicationContext context = SpringApplication.run(RoomDay04Application.class, args);
	 	
	 	Desk desk = context.getBean(Desk.class);
	 	
	 	desk.setColour("Brown");
	 	
	 	Desk desk2 = new Desk("Study", "Brown", "Bajaj");
	 	
	 	System.out.println(desk.getColour());
	 	
	 	
	}

}
