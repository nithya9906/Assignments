package com.serialization.java;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
	private int empId;
	private String name;
	private transient double salary;
	private String designation;
	Employee(){}
	public Employee(int empId, String name, double salary, String designation) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public void getData()
	{
		System.out.println("Enter details of employee...");
		Scanner in=new Scanner(System.in);
		empId=in.nextInt();
		name=in.next();
		salary=in.nextDouble();
		designation=in.next();
		
	}
	public void display()
	{
		System.out.println("Id:"+empId);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Designation:"+designation);
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}
	

}
