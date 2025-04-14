package com;

public class MultiplicationTableOf5 {
	public static void main(String[] args) {
		int n = 5;
		int prod =1;
		for(int i=1;i<=10;i++)
		{
			prod = n*i;
			System.out.println(n+" x "+ i + " = " + prod);
		}
	}
}
