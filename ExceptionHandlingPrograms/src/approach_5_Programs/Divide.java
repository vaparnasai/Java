package approach_5_Programs;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		int chance =0;
		while(true)
		{
			try
			{
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException e)
			{
				if (chance==3)
				{
					System.out.println("You reached the Max-Limit,,Sorry Better Luck Next Time!!");
					break;
				}
				else
				{
					System.out.println("Your having "+(3-chance)+"Chances...!");
					System.out.println("Re-Enter the valid number :");
					b=sc.nextInt();
					chance++;
				}
			}
		}
	/*	for (int i=1;i<=3;i++)
		{
				try
				{
					System.out.println(a/b);
					break;
				}
				catch(ArithmeticException e)
				{
					System.out.println("Enter the valid number :");
					System.out.println("The chances left are "+(3-i));
					b=sc.nextInt();
				}
		} */
	}
}
