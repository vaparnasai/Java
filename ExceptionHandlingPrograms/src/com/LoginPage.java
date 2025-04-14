package com;

import java.util.Scanner;

public class LoginPage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Username:");
		String a = sc.next();
		System.out.println("Enter a Password");
		int b = sc.nextInt();
		if (a.equals("Admin"))
		{
			if(b==123)
			{
				System.out.println("Login successfull");
			}
			else
			{
				InvalidPasswordException e = new InvalidPasswordException();
				throw e;
			}
		}
		else
		{
			InvalidUsernameException e = new InvalidUsernameException();
			throw e;
		}
	}
}
