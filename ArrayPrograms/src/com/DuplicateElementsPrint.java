package com;

public class DuplicateElementsPrint {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,2,8,4,1};
		for (int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
