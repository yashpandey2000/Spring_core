package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class domain {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(javaconfig.class);
		
		student std =  con.getBean("getstudent",student.class);
		
		System.out.println(std);
		
       
		std.study();
		
		
	}

	

	
	
}
