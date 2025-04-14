package com;

public class MainThreadClass1 
{
	public static void main(String[] args) {
	//	Demo1 d = new Demo1();
		Runnable d = new Demo1();
		Thread t = new Thread(d);
		t.start();
	}
}
