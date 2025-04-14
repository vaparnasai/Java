package com;

public class EvenLargestNo {
	public static void evenLargest (int a [])
	{
		int evenLargest = a[0];
		for (int i =0;i<=a.length-1;i++)
		{
			if (a[i]%2==0)
			{
				if (a[i]>evenLargest)
				{
					evenLargest=a[i];
					
				}
				
			}
		}System.out.println("even largest element :" +evenLargest);
	}
	public static void main(String[] args) {
		int [] a = {2,6,9,11,24,25};
		
		evenLargest(a);
	}

}
