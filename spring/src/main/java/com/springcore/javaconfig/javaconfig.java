package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaconfig {
	
	@Bean
	public student getstudent(){
		
		/*here we re creating a new object of student*/
		
		student std = new student();
		
		return std;
		
		
		
	}
	

}
