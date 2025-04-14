package com;

public class InvalidUsernameException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass() + ": You entered Invalid Username";
	}
}
