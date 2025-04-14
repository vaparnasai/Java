import java.util.Scanner;
class AreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("              Area Calculator");
		System.out.println("=============================================");
		System.out.println("Enter 1 to find circle area");
		System.out.println("Enter 2 to find triangle area");
		System.out.println("Enter 3 to find square area");
		System.out.println("Enter 4 to find rectangle area");
		System.out.println("Enter 5 to find parallelogram area");
		System.out.println("Enter 6 to find trapezium area");
		System.out.println("Enter 7 to find rhombus area");
		System.out.println("=============================================");
		System.out.print("Enter your choice : ");
		int n = sc.nextInt();
		if (n==1)
		{
			System.out.println("You have choosen to find area of a circle");
			System.out.print("Enter radius of a circle : ");
			double r = sc.nextDouble();
			System.out.println("Area of circle : "+3.14*r*r);
		}
		else if (n==2)
		{
			System.out.println("You have choosen to find area of a triangle");
			System.out.print("Enter base of a triangle : ");
			double b = sc.nextDouble();
			System.out.print("Enter height of a triangle : ");
			double h = sc.nextDouble();
			System.out.println("Area of triangle : "+0.5*b*h);
		}
		else if (n==3)
		{
			System.out.println("You have choosen to find area of a square");
			System.out.print("Enter side of a square : ");
			double s = sc.nextDouble();
			System.out.println("Area of square : "+s*s);
		}
		else if (n==4)
		{
			System.out.println("You have choosen to find area of a rectangle");
			System.out.print("Enter length of a rectangle : ");
			double l = sc.nextDouble();
			System.out.print("Enter breadth of a rectangle : ");
			double b = sc.nextDouble();
			System.out.println("Area of rectangle : "+l*b);
		}
		else if (n==5)
		{
			System.out.println("You have choosen to find area of a parallelogram");
			System.out.print("Enter base of a parallelogram : ");
			double b = sc.nextDouble();
			System.out.print("Enter height of a parallelogram : ");
			double h = sc.nextDouble();
			System.out.println("Area of parallelogram : "+b*h);
		}
		else if (n==6)
		{
			System.out.println("You have choosen to find area of a trapezium");
			System.out.print("Enter first base of a trapezium : ");
			double base1 = sc.nextDouble();
			System.out.print("Enter second base of a trapezium : ");
			double base2 = sc.nextDouble();
			System.out.print("Enter heigth of a trapezium : ");
			double h = sc.nextDouble();
			System.out.println("Area of trapezium : "+0.5*(base1+base2)*h);
		}
		else if (n==7)
		{
			System.out.println("You have choosen to find area of a rhombus");
			System.out.print("Enter first diagonal of a rhombus : ");
			double d1 = sc.nextDouble();
			System.out.print("Enter second diagonal of a rhombus : ");
			double d2 = sc.nextDouble();
			System.out.println("Area of rhombus : "+0.5*d1*d2);
		}
	}
}
