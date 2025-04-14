package org;

public class LongestWord {
	public static void main(String[] args) {
		String s = "I am a A Java Developer";
		String str [] = s.split(" ");
		int length = 0;
		String longestString="";
		for (int i = 0;i<=str.length-1;i++)
		{
			if (str[i].length()>length)
			{
				length = str[i].length();
				longestString=str[i];
			}
		}
		System.out.println("Longest String is :"+longestString+" Length is "+length);
	}
}
