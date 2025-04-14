package com;

public class NotPalindromeException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": RevString is not equals to the Given String";
	}
}
