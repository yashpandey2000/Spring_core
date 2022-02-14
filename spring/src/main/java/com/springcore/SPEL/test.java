package com.springcore.SPEL;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SPEL/spel.xml");
		
		Demo d = context.getBean("demo",Demo.class);
		
		System.out.println(d);
		
		
		
	}
	
	
	

}
