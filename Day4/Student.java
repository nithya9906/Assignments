package com.revature.day4Assignments;

public class Student {
	private int studentId;
	private String name;
	private String address;
	Student(){}
	public Student(int studentId, String name, String address) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
