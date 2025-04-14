package approach_4_Programs;

import java.util.Scanner;

public class AIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		int a [] = {1,9,3,2};
		System.out.println("Enter an index to get element :");
		int index = sc.nextInt();
		while(true)
		{
			try
			{
				System.out.println(a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Re-enter the valid index :");
				index=sc.nextInt();
			}
		}
		System.out.println("Main Ends");
	}
}
