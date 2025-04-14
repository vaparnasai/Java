package org;

public class EvenIndexCharc {
	public static void main(String[] args) {
		String s = "India";
		for (int i=0;i<= s.length()-1;i++)
		{
			if (i%2==0 && i!=0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
