package com.springcore.steriotypeanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/steriotypeanno/config.xml");
	
	/*for singleton scope*/
	
	//Student std = context.getBean("ob",Student.class);
	
	//System.out.println(std.hashCode());
	
	//System.out.println(std.getAddress());
	//System.out.println(std.getAddress().getClass().getName());
	
	//Student std1 = context.getBean("ob",Student.class);
	
	//System.out.println(std1.hashCode());
	
	
	
	
	/*for prototype scope*/
	
	Teacher t1 = context.getBean("tec",Teacher.class);
	
	System.out.println(t1.hashCode());
	
	Teacher t2 = context.getBean("tec",Teacher.class);
	
	System.out.println(t2.hashCode());

	}
	
}
