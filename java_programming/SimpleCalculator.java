import java.util.Scanner;
class  SimpleCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("           Simple Calculator");
		System.out.println("======================================");
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.print("Enter the Arithemetic operator : ");
		char op = sc.next().charAt(0);
		if (op=='+')
		{
			System.out.println("Sum of a number is : "+(n1+n2));
		}
		else if (op=='-')
		{
			System.out.println("Difference of a number is : "+(n1-n2));
		}
		else if (op=='*')
		{
			System.out.println("Product of a number is : "+(n1*n2));
		}
		else if (op=='/')
		{
			System.out.println("quotient of a number is : "+(n1/n2));
		}
		else if (op=='%')
		{
			System.out.println("Remainder of a number is : "+(n1*n2));
		}
		else 
		{
			System.out.println("Enter a valid operator");
		}
	}
}
