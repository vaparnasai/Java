package cursorPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample2 
{
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Java");
		l.add("Jsp");
		l.add("Python");
		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext())
		{
			int index = ltr.nextIndex();
			String s = ltr.next();
			System.out.println(index+"-->"+s);
		}
		System.out.println("------------------------");
		while(ltr.hasPrevious())
		{
			int index = ltr.previousIndex();
			String s = ltr.previous();
			System.out.println(index+"-->"+s);
		}
	}
}
