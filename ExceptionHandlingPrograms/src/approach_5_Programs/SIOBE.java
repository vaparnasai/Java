package approach_5_Programs;

import java.util.Scanner;

public class SIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		String s = "Java";
		System.out.println("Enter an index to get char:");
		int index = sc.nextInt();
		int chance=0;
		while(true)
		{
			try
			{
				System.out.println(s.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException e)
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
