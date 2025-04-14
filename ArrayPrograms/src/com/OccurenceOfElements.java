package com;

public class OccurenceOfElements 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,1,2,4,5};
		for (int i=0;i<=a.length-1;i++)
		{
			int count =1;
			if (a[i]!=-1)
			{
				for(int j=i+1;j<=a.length-1;j++) 
				{
					if (a[i]==a[j])
					{
						count++;
						a[j]=-1;
					}
				}
			}
			if(a[i]!=-1)
			{
				System.out.println(a[i] + "is Repeated " +count + " Times");
			}
		}
	}
}
