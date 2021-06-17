package com.revature.CloneExample;

public class Employee implements Cloneable{
	private int empId;
	private String name;
	private double salary;
	Employee(){}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}  

}
