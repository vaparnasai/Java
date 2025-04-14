package style2_programming;

public class EmployeeValidation {
	
	/*employee name validation*/
	public static boolean employeeNameValidation(String empName)
	{
		
		/* condition1 :employee name must have only characters
		 * condition2 :first letter must be capital
		 */
		
		int condition1Status=0;
		int condition2Status=0;
		
		/* condition 1 logic */
		/* length of string : if(empName.length()==4 ) */
		int count=0;
		
		for(int i=0;i<empName.length();i++)
		{
			
			char ch=empName.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				 count++;
				
				
			}
		}
		if(count==4)
		{
			 condition1Status=1;
		}
			
			
			/* condition 2 logic */
			if(Character.isUpperCase(empName.charAt(0)))
			{
				condition2Status=1;
			}
			
			/* climax logic */
			
			
			if(condition1Status==1 && condition2Status==1)
			{
				return true;
				
			}
			else
			{
				return false;
			}
		}
public static boolean employeeIdValidation(String empId)
	{
		/*emp id  must be only 6 characters with formate : "EMPxxx:EMP123...*/
	           int condition =0;
		        int count=0;
		        for(int i=0;i<empId.length();i++)
		        {
		        	count++;
		        }
		        if(count==6) 
		        {
		        	if(empId.charAt(0)=='E' && empId.charAt(1)=='M' && empId.charAt(2)=='P')
		        	{
				       for(int i=3;i<empId.length()-1;i++)
				       {
				    	   if(Character.isDigit(empId.charAt(i)))
				    			   {
				    		           condition=1;
				    			   }
				       }
					
				    }
				
		        }
		        
		        if(condition==1)
		        {
		        	return true;
		        }
		       
		         else
		        {
		        	return false;
		        }	
	}

	
	public static boolean employeeSalaryValidation(long empSalary)
	{
		// employee salary must be between 15000 and 100000
		if(empSalary>15000 && empSalary<100000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	}
	
	


