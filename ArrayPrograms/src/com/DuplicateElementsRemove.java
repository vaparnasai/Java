package com;

public class DuplicateElementsRemove {
	public static void main(String[] args) {
		int a [] = {1,2,4,3,2,1,6};
		int temp[]=new int[a.length];
		int uniqueElement = 0;
		for (int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<i;j++)
			{
				if (a[i] ==a[j])
				{
					count++;
					break;
				}
			}
			if (count ==0)
			{
				temp[uniqueElement]=a[i];
				uniqueElement++;
			}
		}
		for(int i=0;i<uniqueElement;i++)
		{
			System.out.println(temp[i]+" ");
		}
	}
}
