package com;

public class Trainer
{
	
	synchronized public void askQuestion(String name)
	{
		System.out.println(name+" is Asking The Question");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" Will Get The Answer");
		System.out.println("----------------------------------------");
		
	}
}
