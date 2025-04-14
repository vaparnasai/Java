package com;

public class BookCostValidationClass 
{
	public static boolean bookCostValidation(int cost)
	{
	//condition :500 to 5000
	
			int conditionStatus=0;
			int count=0;
			if(count>500 && count<5000)
			{
				 conditionStatus=1;
				 return true;		
			}
			else
			{
				return false;
			}
	}
}
