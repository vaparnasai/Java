package cursorPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample1 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(15);
		al.add(23);
		al.add(7);
		ListIterator<Integer> ltr = al.listIterator();
		while(ltr.hasNext())
		{
			int index = ltr.nextIndex();
			Integer i = ltr.next();
			System.out.println(index+"-->"+i);
		}
		System.out.println("------------------------");
		while(ltr.hasPrevious())
		{
			int index = ltr.previousIndex();
			Integer i = ltr.previous();
			System.out.println(index+"-->"+i);
		}
	}
}
