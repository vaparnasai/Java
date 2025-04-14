package com;

public class InavalidNoOfPagesException extends RuntimeException
{
	@Override
	public String toString() 
	{
		return getClass()+": Invalid no of pages!! must be between 400 to 3000";
	}
}
