package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection.xml");
	
	emp emp1 = (emp) context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhone());
	System.out.println(emp1.getAdd());
	System.out.println(emp1.getCourses());
		
		
	}

}
