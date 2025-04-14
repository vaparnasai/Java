package style2_programming;

public class CarValidation {
	public static boolean carNameValidation(String carName)
	{
		int count=0;
		for(int i=0;i<carName.length();i++)
		{
			count++;
		}
		if(count>=5 &&  carName.charAt(carName.length()-1)=='r')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean carNumberValidation(String carNumber)
	{
		int condition=0;
		if(carNumber.substring(0,6)=="TN-XX-")
		{
			for(int i=6;i<carNumber.length();i++)
			{
				char ch=carNumber.charAt(i);
				if(Character.isDigit(ch))
				{
					condition=1;
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
	
	public static boolean carPriceValidation(long carPrice)
	{
		if(carPrice>3000000 && carPrice<=100000000)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean fuelTypeValidation(String fuelType)
	{
		if(fuelType.equals("Petrol") || fuelType.equals("Diesel") || fuelType.equals("Electric"))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean carMilageValidation(String fuelType,int milage)
	{
		int condition =0;
		if(fuelType.equals("Petrol") || fuelType.equals("Diesel"))
		{

            if(milage>=10 && milage<=40)
            {
            	condition=1;
            }
			
		}
		if(fuelType.equals("Electric"))
		{
			if(milage>=100 && milage<=600)
			{
				condition=1;
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
}

