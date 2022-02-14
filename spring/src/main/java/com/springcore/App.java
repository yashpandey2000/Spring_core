package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		
	   Student std1 = (Student) context.getBean("student1");
	  
		
		System.out.println(std1);
		
	}
}
 