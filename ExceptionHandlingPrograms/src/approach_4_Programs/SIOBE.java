package approach_4_Programs;

import java.util.Scanner;

public class SIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		String s = "Java";
		System.out.println("Enter an index to get char:");
		int index = sc.nextInt();
		while(true)
		{
			try
			{
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Re-enter the valid index  :");
				index = sc.nextInt();
			}
		}
		System.out.println("Main Ends");

	}
}
