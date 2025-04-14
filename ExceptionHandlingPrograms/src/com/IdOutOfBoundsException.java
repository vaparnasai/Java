package com;

public class IdOutOfBoundsException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": Your given book id is not 5 random digit number";
	}

}
