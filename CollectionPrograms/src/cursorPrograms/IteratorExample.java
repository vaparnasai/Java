package cursorPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("API");
		al.add("Springboot");
		al.add("MicroServices");
		al.add("Servers");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if (s.length()>3)
			{
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
