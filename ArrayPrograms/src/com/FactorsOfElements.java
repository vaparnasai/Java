package com;

public class FactorsOfElements {
	public static void main(String[] args) {
		int a [] = {2,3,6,7,12};
		for (int i = 0;i<=a.length-1;i++)
		{
			for (int j=1;j<=a[i];j++)
			{
				int factor = a[i]%j;
				if (factor == 0) 
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
