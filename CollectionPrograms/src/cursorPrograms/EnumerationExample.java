package cursorPrograms;


import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample 
{
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(7);
		v.add(1);
		v.add(8);
		v.add(6);
		v.add(10);
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())
		{
			Integer i = enu.nextElement();
			System.out.println(i);
		}
	}
}
