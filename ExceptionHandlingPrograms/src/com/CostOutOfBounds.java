package com;

public class CostOutOfBounds extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": You entered an invalid range of cost between 500 and 2500";
	}

}
