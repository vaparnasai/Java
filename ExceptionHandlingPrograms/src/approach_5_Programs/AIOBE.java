package approach_5_Programs;

import java.util.Scanner;

public class AIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		int a [] = {1,9,3,2};
		System.out.println("Enter an index to get element :");
		int index = sc.nextInt();
		int chance = 0;
		while(true)
		{
			try
			{
				System.out.println(a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				if (chance==3)
				{
					System.out.println("You reached the Max-Limit,,Sorry Better Luck Next Time!!");
					break;
				}
				else
				{
					System.out.println("Your having "+(3-chance)+"Chances...!");
					System.out.println("Re-enter the valid index :");
					index=sc.nextInt();
					chance++;
				}
			}
		}
		System.out.println("Main Ends");
	}
}
