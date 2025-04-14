package cursorPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(33);
		al.add(23);
		al.add(14);
		
		ListIterator<Integer> ltr = al.listIterator();
		while(ltr.hasNext())
		{
			Integer i = ltr.next();
			if(i%2==0)
			{
				ltr.add(1);
			}
		}
		while(ltr.hasPrevious())
		{
			Integer i = ltr.previous();
			if(i%2==1)
			{
				ltr.remove();
			}
		}
		System.out.println(al);
	}
}
