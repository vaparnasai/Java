package com;

public class MainThreadClass 
{
	public static void main(String[] args)
	{
		Welcome w = new Welcome();
		w.start();	
		ATB a = new ATB();
		a.start();
	}
}
