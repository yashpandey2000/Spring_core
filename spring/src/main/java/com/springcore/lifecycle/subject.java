package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class subject {
	
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public subject(String sub) {
		super();
		this.sub = sub;
	}

	public subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "subject [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start(){
		
		System.out.println("init method");
	}
	
	
	@PreDestroy
public void end(){
		
		System.out.println("destroy method");
	}
	

}
