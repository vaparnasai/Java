package com;

public class SecondLargestAndSmallestElement {
	public static void smallest (int [] a)
	{
		int smallest = a[0];
		for (int i = 0; i<=a.length-1 ;i++ )
		{
			if (a[i] < smallest)
			{
				smallest = a[i];
			}
		}
		System.out.println("Smallest :"+smallest);
	}
	public static void largest (int [] a)
	{
		int largest = a[0];
		for (int i = 0; i<=a.length-1 ;i++ )
		{
			if (a[i] > largest)
			{
				largest = a[i];
			}
		}
		System.out.println("Largest :"+largest);
	}
	

	public static void main(String[] args) {
		int [] a = {2,3,4,6,8};
		smallest(a);
		largest(a);
		
	}
}
