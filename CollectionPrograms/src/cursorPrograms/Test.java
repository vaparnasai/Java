package cursorPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test 
{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rolex");
		al.add("Qsp");
		al.add("Tom");
		al.add("Tyss");
		ListIterator<String> ltr = al.listIterator();
		while(ltr.hasNext())
		{
			String s = ltr.next();
			if(s.equals("Rolex"))
			{
				ltr.add("Scott");
			}
		}
		System.out.println(al);
	}
}
