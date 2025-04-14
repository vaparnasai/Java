package com;


public class Demo1 {
	public static void main(String[] args) {
		try
		{
			System.out.println(2+5);
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
	}
}
