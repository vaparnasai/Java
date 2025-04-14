package com;

public class Welcome extends Thread
{
	@Override
	public void run()
	{
		//Task
		String s = "WELCOME TO JSPIDERS";
		for(int i=0;i<=s.length()-1;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

}
