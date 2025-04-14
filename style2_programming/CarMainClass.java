package style2_programming;

public class CarMainClass {

	public static void main(String[] args)
	{
		//object creation 
		Car firstCar=new Car();
		firstCar.provideCarDetails("Fortuner" , "TN-XX-9999",300000,"Petrol", 20);
		firstCar.viewCarDetails();
		Car secondCar=new Car();
		secondCar.provideCarDetails("Maruthi" , "TN-XX-9949",335460,"Electric", 120);
		secondCar.viewCarDetails();
	}
}