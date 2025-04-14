package character_oriented_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PalindromeOrNot 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String rev = sc.next();
		String srev ="";
		for (int i = rev.length()-1;i>=0;i--)
		{
			srev = srev + rev.charAt(i);
		}
		if(srev.equals(rev))
		{
			System.out.println("Palindrome");
			File f = new File("Palindrome.txt");
			try {
				System.out.println(f.createNewFile());
				FileWriter fr = new FileWriter(f);
				fr.write(rev);
				fr.flush();
				fr.close();
			}
			catch (IOException e) 
			{
				System.out.println("Handled");
			}
			
		}
		else
			System.out.println("It is not a Palindrome");
	}
}
