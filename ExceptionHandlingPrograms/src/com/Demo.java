package com;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		int x = 10;
		System.out.println(x+2);
		System.out.println(x-2);
		try
		{
			System.out.println(x/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide a number by zero");
		}
		System.out.println(x/2);
		System.out.println(x+10);
		System.out.println("Main Ends");
	}
}
