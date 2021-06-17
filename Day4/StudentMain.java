package com.revature.day4Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class StudentMain {
	public static void main(String []args)
	{
		System.out.println("Using ArrayList.....");
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(11,"rohan","chennai"));
		studentList.add(new Student(12,"renu","madurai"));
		studentList.add(new Student(13,"aarthi","theni"));
		studentList.add(new Student(14,"jothi","rajapalayam"));
		studentList.add(new Student(15,"swathi","nagercoil"));
		
		Iterator sitr=studentList.iterator();
		while(sitr.hasNext())
		{
			System.out.println(sitr.next());
		}
		
		System.out.println("Using HashSet.....");
		HashSet<Student> studentSet=new HashSet<Student>();
		studentSet.add(new Student(11,"rohan","chennai"));
		studentSet.add(new Student(12,"renu","madurai"));
		studentSet.add(new Student(13,"aarthi","theni"));
		studentSet.add(new Student(14,"jothi","rajapalayam"));
		studentSet.add(new Student(15,"swathi","nagercoil"));
		
		Iterator itr=studentSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
