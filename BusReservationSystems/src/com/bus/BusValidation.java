package com.bus;

public class BusValidation 
{
	public static boolean busNameValidation(String busName)
	{
		//condition: Minimum 5 characters
        int condition1Status=0;
		int count=0;
		
		for(int i=0;i<busName.length();i++)
		{
			
			char ch=busName.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				 count++;
				
				
			}
		}
		if(count>5)
		{
			 condition1Status=1;
			 return true;
		}	
		else
			return false;
	}
}
