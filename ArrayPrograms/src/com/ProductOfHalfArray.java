package com;

public class ProductOfHalfArray {
	public static void main(String[] args) {
		int [] a = {2,5,3,4};
		int prod =1;
		for (int i=0;i<=(a.length-1)/2;i++)
		{
			prod = prod *a[i];
		}
		System.out.println(prod);
	}
}
