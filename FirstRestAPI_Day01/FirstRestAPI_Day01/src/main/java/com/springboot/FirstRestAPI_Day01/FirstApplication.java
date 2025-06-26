package com.springboot.FirstRestAPI_Day01;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("/propertiesFile/application.properties")
public class FirstApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstApplication.class, args);
		
		Student student = context.getBean(Student.class);
		
		System.out.println(student.getName());
	}

}
