package com;
//public same packages in same class
public class Demo {
	public int a ;
	
	public Demo()
	{
		System.out.println("Hi Java");
	}
	
	public void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.a);
		d.display();
	}
}
