package com;

public class FileNotPresent extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+":File is not present";
	}
}
