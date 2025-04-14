package com;

public class Flipkart 
{
	synchronized public void payment(String mode)
	{
		System.out.println("Payment through "+mode+"?");
		try
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Payment is done through "+mode);
		System.out.println("----------------------------------------");
	}

}

