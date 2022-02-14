package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class emp {
	
	private String name;
	private List<String> phone;
	private Set<String> add;
	private Map<String, String> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAdd() {
		return add;
	}
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	public emp(String name, List<String> phone, Set<String> add, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.add = add;
		this.courses = courses;
	}
	
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "emp [name=" + name + ", phone=" + phone + ", add=" + add + ", courses=" + courses + "]";
	}
	
	
	
	
	
	
	

}
