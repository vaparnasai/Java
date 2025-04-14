package com;

public class InvalidNoOfPagesException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": You entered an invalid range for no of pages between 300 and 1500";
	}
}
