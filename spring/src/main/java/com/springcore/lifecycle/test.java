package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
	AbstractApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/lifecycle/life.xml");
	
	
	context.registerShutdownHook();
	
	subject sub = (subject) context.getBean("sub1");
		
	System.out.println(sub);
		
	}
}
