package style2_programming;

public class Car {
	private static String carName;
	private static String carNumber;
	private static long carPrice;
	private static String fuelType;
	private static int milage;
	
	

public void provideCarDetails(String carName , String carNumber,long carPrice,String fuelType, int milage)
{
	boolean carNameValidationStatus= CarValidation.carNameValidation(carName);
	if(carNameValidationStatus)
	{
		this.carName=carName;
	}
	else
	{
		System.err.println("invalid car name.....");
	}
	
	
	boolean carNumberValidationStatus= CarValidation.carNumberValidation(carNumber);
	if(carNumberValidationStatus)
	{
		this.carNumber=carNumber;
	}
	else
	{
		System.err.println("invalid car number.....");
	}
	
	boolean carPriceValidationStatus= CarValidation.carPriceValidation(carPrice);
	if(carPriceValidationStatus)
	{
		this.carPrice=carPrice;
	}
	else
	{
		System.err.println("invalid car Price.....");
	}
	
	boolean carFuelValidationStatus= CarValidation.fuelTypeValidation(fuelType);
	if(carFuelValidationStatus)
	{
		this.fuelType=fuelType;
	}
	else
	{
		System.err.println("invalid fuel.....");
	}
	boolean carMilageValidationStatus= CarValidation.carMilageValidation(fuelType,milage);
	if(carMilageValidationStatus)
	{
		this.milage=milage;
	}
	else
	{
		System.err.println("invalid milage.....");
	}	
}
	public void onRoadPriceCalculator(long carPrice)
	{
		long onRoadPrice = carPrice + (long)(0.10 * carPrice);
		System.out.println("on Road price:"+onRoadPrice);
	}
	public void ecoFriendly(String fuelType)
	{
		if(fuelType.equals("Electric"))
		{
			System.out.println(carName+" eco-friendly car");
		}
		if(fuelType.equals("Petrol") || fuelType.equals("Diesel"))
		{
			System.out.println(carName+" not eco-friendly car");
		}		
	}
	
	public void viewCarDetails()
	{
		System.out.println("==============================================================================");
		System.out.println("car name : "+carName);
		System.out.println("car number "+carName);
		System.out.println("car price : "+carName);
		onRoadPriceCalculator(carPrice);
		System.out.println("car fuel type : "+carName);
		if(fuelType.equals("Electric"))
		{
			System.out.println("car milage : "+milage +" KM");
		}
		if(fuelType.equals("Petrol") || fuelType.equals("Diesel"))
		{
			System.out.println("car milage : " +milage +" KMPL");
		}
		ecoFriendly(fuelType);
		System.out.println("==============================================================================");	
	}
}
