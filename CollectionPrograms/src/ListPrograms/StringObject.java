package ListPrograms;

import java.util.ArrayList;

public class StringObject 
{
	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Bat");
		al.add("Car");
		al.add("Dog");
		al.add("Elephant");
		for (int i=0;i<=al.size()-1;i++)
		{
			//String s = (String)al.get(i);
			String s = al.get(i);
			System.out.println("First Character is "+s.charAt(0));
			System.out.println("Length of string is "+s.length());	
			System.out.println("----------------------------------------");
		}
	}
}
