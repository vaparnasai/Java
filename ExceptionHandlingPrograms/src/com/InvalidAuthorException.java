package com;

public class InvalidAuthorException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": You entered an invalid author";
	}

}
