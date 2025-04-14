package com;
//protected same package same class
public class Demo3 {
	protected int x =10;
	protected void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		System.out.println(d.x);
		d.run();
	}
}
