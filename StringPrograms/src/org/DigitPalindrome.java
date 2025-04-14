package org;

public class DigitPalindrome {
	public static void main(String[] args) {
		String s = "J12s345p";
		String s1 = "";
		for (int i = 0; i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if (Character.isDigit(ch))
			{
				s1=s1+ch;
			}
		}
		int num = Integer.parseInt(s1);
		int temp = num;
		int sum = 0;
		while(temp!=0)
		{
			int digit = temp%10;
			sum = sum + digit;
			temp = temp/10;
		}
		System.out.println(sum);
		int rev = 0;
		int sumtemp = sum;
		while(sumtemp!=0)
		{
			int digit = sumtemp%10;
			rev = rev*10+digit;
			sumtemp = sumtemp/10;
		}
		System.out.println(rev);
		if (sum==rev)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome number");
	}
}
