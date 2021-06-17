package com.revature.CloneExample;



public class CloneDemo {
	public static void main(String []args)
	{
		try {
			Employee e1=new Employee(22,"pooja",30000);
			Employee e2=(Employee)e1.clone();
			System.out.println(e1);
			System.out.println(e2);
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		
		
	}

}
