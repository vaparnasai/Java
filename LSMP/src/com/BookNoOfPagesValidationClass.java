package com;

public class BookNoOfPagesValidationClass 
{
	public static boolean bookNoOfPagesValidation(int noOfPages)
	{
		//condition :400 to 3000
		
		int conditionStatus=0;
		int count=0;
		if(count>400 && count<3000)
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
