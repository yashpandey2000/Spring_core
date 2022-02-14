package com.springcore.steriotypeanno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	
	@Value("yash pandey")
	private String stdname;
	
	@Value("indore")
	private String city ;
	
	/*if you want to display collection object than use (#{})
	*/
	
	@Value("#{temp}")
	private List<String> Address;
	
	
	
	public List<String> getAddress() {
		return Address;
	}
	public void setAddress(List<String> address) {
		Address = address;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String stdname, String city) {
		super();
		this.stdname = stdname;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [stdname=" + stdname + ", city=" + city + "]";
	} 
	
	
	
}
