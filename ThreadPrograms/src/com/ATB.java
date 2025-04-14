package com;

public class ATB extends Thread
{
	@Override
	public void run()
	{
		//Task
		String s = "ALL THE BEST FOR YOUR CAREER";
		for(int i=0;i<=s.length()-1;i++)
		{
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
			System.out.print(s.charAt(i));
		}
	}
}
