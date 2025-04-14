package ListPrograms;

import java.util.ArrayList;

public class IntegerObjects 
{
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		int largest=0;
		for (int i=0;i<=al.size()-1;i++)
		{
			int i1 = (int)al.get(i);
			if(i1>largest)
			{
				largest = i1;
			}
			if (i1%2==0)
			{
				System.out.println("The element is even element : "+i1);
			}
		}
		System.out.println("-------------------------------");
		System.out.println("The largest element is "+largest);
	}
}
