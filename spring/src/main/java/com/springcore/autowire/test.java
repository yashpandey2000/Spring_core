package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/auto.xml");
		
		Emp emp  = (Emp) context.getBean("emp");
		
		System.out.println(emp);
	}

}
