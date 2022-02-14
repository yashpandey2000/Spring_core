package com.springcore;

public class Student {
	
	private int studentid;
	private String studentname;
	private String studentadd;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentadd() {
		return studentadd;
	}
	public void setStudentadd(String studentadd) {
		this.studentadd = studentadd;
	}
	
	
	public Student(int studentid, String studentname, String studentadd) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentadd = studentadd;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentadd=" + studentadd + "]";
	}
	
	
	
	
	
	
	
	
	

}
