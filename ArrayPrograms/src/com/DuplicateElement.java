package com;

public class DuplicateElement 
{
	public static void duplicate (int [] a)
	{
		System.out.println("Duplicate elements are :");
		boolean duplicate = false;
		
		for (int i = 0;i<=a.length-1;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i] == a[j])
				{
					System.out.println(a[i] + " ");
					duplicate = true;
					break;
				}
			}
		}
		if (!duplicate)
		{
			System.out.println("No Duplicate elements");
		}
	}
	public static void main(String[] args) {
		int a [] = {1,2,3,3};
		duplicate(a);
	}

}
