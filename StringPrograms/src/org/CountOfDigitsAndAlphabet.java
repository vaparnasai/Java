package org;

public class CountOfDigitsAndAlphabet {
	public static void main(String[] args) {
		String s = "Jsp123";
		int alphaCount = 0;
		int digitCount =0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if (ch >= 'A' && ch<='Z' || ch >= 'a' && ch<='z')
			{
				alphaCount++;
			}
			else if (ch >= '0' && ch<='9')
			{
				digitCount++;
			}
		}
		System.out.println("Alpha Count is "+ alphaCount + "\nDigit count is " + digitCount);
	}
}
