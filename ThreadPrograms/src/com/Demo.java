package com;

public class Demo 
{
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.getId());
		t.setName("Red");
		t.setPriority(7);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("--------------------------");
		Thread t1 = new Thread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}
}
