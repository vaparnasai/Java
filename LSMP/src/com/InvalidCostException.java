package com;

public class InvalidCostException extends RuntimeException
{
	@Override
	public String toString() {
		return getClass()+":Invalid cost! must be between 500 to 5000";
	}
}
