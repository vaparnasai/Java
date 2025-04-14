package com;

public class Demo1 {
	private int a;
	private Demo1()
	{
		System.out.println("Hi Java");
	}
	private void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.a);
		d.display();
	}
}
