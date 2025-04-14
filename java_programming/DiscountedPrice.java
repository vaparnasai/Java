import java.util.Scanner;
class  DiscountedPrice
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill amount : ");
		double bill = sc.nextDouble();
		if (bill>=5000)
		{
			System.out.println("You got 18% discount on the bill");
			System.out.println("Your final bill is : " +0.82*bill);
		}
		else
		{
			System.out.println("You got 8% discount on the bill");
			System.out.println("Your final bill is : " +0.92*bill);
		}
	}
}
