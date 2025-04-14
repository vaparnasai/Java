import java.util.Scanner;
class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a circle:");
		double r = sc.nextDouble();
		System.out.println("Area of circle is:"+3.14*r*r);
	}
}
