package approach_1_Programs;

import java.util.Scanner;

public class SIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		String s = "Java";
		System.out.println("Enter an index to get char:");
		int index = sc.nextInt();
		System.out.println(s.charAt(index));
		System.out.println("Main Ends");

	}
}
