package com;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String rev = sc.next();
		String srev ="";
		for (int i = rev.length()-1;i>=0;i--)
		{
			srev = srev + rev.charAt(i);
		}
		if(srev.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			throw new NotPalindromeException();
		}
	}
}
