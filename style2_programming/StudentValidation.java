package style2_programming;

public class StudentValidation 
{
	private static int [] stdIds = new int[100];
	private static int index = 0;
	public static boolean nameValidation(String stdName)
	{
		/*Condition1 : Check the string has 4 characters*/
		/*Condition2 : Check first letter is capital*/
		
		/*Condition1 logic*/
		int condition1 =0;
		int condition2 =0;
		int count =0;
		for (int i =0;i<= stdName.length()-1;i++)
		{
			 count++;
		}
		if (count == 4)
		{
			condition1 = 1;
		}
		
		/*Condition2 logic*/
		char firstCharacter = stdName.charAt(0);
		if(Character.isUpperCase(firstCharacter))
		{
			condition2 = 1;
		}
		
		/*Climax logic */
		if (condition1 == 1 && condition2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public static boolean idValidation(int stdId) 
	{
		/*Condition1 : Check the id has 4 digits*/
		/*Condition2 : Check id must be unique*/
		
		/*Condition1 logic*/
		int condition1Status =0;
		int condition2Status =0;
		int count =0;
		int temp = stdId;
		while(temp!=0)
		{
			count++;
			temp = temp/10;
		}
		if (count == 4)
		{
			condition1Status = 1;
		}
		/*Condition2 logic*/
		boolean isUnique = true;
		for (int i=0;i<=stdIds.length-1;i++)
		{
			if(stdId == stdIds[i])
			{
				isUnique = false;
				break;
			}
		}
		if (isUnique)
		{
			condition1Status =1;
			condition2Status =1;
			count++;
		}
		
		/*Climax logic */
		if (condition1Status == 1 && condition2Status == 1)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public static boolean percentangeValidation (double stdPercentage) 
	{
		if(stdPercentage>=1 && stdPercentage<=99)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
