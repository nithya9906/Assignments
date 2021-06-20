package com.threadAssignments;

public class PrintNumber extends Thread{
	String str;
	PrintNumber(String s){
		str=s;
	}
	public void run()
	{
		System.out.println("Running...."+str);
		try {
			
			for(int i=1;i<=10;i++)
			{ 
				
				System.out.println(i);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}