package com;

public class SwiggyExceptionHandling {
	public static void order()
	{
		System.out.println("Order a pizza");
	}
	public static void delivery() throws InterruptedException
	{
		order();
		Thread.sleep(2000);
		System.out.println("Restaurant is closed");
	}
	public static void manager() throws InterruptedException
	{
		delivery();
		System.out.println("Customer support");
	}
	public static void main(String[] args) 
	{
		try
		{
			delivery();
		}
		catch(InterruptedException e)
		{
			System.out.println("Call to the manager");
			try
			{
				manager();
			}
			catch(InterruptedException e1)
			{
				System.out.println("Option 1.Order from different restaurant \n Option 2.Refund");
			}
		}
	}
}
