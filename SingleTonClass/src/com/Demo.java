package com;

public class Demo {
	private static Demo d = null;
	private Demo()
	{
		System.out.println("Demo is Executing");
	}
	public static void createObject()
	{
		if(d==null)
		{
			d = new Demo();
			System.out.println("Object is created");
		}
		else
		{
			System.out.println("Object is already created");
		}
	}
}
