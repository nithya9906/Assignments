package com.threadAssignments;

public class NumberMain {
	public static void main(String[] args) {
	
		
		
		for(int i=0;i<2;i++)
		{
			PrintNumber p=new PrintNumber("Thread"+i);
			System.out.println("Thread "+p.getName());
			p.start();
		}
	}
}