package com.revature.enumDemo;



public class EnumExample {
	enum Direction{
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	public static void main(String []args)
	{
		Direction d=Direction.SOUTH;
		System.out.println(d);
		//ordinal() to find the index of the value
		System.out.println("Index of direction SOUTH is "+Direction.valueOf("SOUTH").ordinal());
		System.out.println(d);
		
		for(Direction dir: Direction.values())
		{
			System.out.println(dir);
		}
		
	}
}
