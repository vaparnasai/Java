package com;
import java.util.Scanner;
public class IndexPosition {
	public static String isPresent (int [] a,int index )
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]== index)
			{
				return "Yes given element is Present in index :" + i;
			}
		}
			return "Given Element is Not Present";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = {1,2,3,4};
		System.out.println("Enter the element to check ");
		int index = sc.nextInt();
		String res = isPresent(a,index);
		System.out.println(res);
	}

}
