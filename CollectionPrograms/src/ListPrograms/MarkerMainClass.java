package ListPrograms;

import java.util.Vector;

public class MarkerMainClass 
{
	public static void main(String[] args) {
		Marker m1 = new Marker("Cello", "Blue", 20);
		Marker m2 = new Marker("Camlin", "Red", 25);
		Marker m3 = new Marker("Doms", "Black", 50);
		Vector v = new Vector();
		v.add(m1);
		v.add(m2);
		v.add(m3);
		for (int i=0;i<=v.size()-1;i++)
		{
			Marker m = (Marker)v.get(i);
			if(m.getColour().equalsIgnoreCase("Red"))
			{
				m.display();
			}
			System.out.println("------------------------------");
			if(m.getCost()>40)
			{
				System.out.println("Colour :"+m.getColour());
			}
		}
		int cheapest=0;
		for (int i=0;i<=v.size()-1;i++)
		{
			int i1 = (int)v.get(i);
			if(i1<cheapest)
			{
				cheapest = i1;
			}
		}
		System.out.println("The cheapest marker is ");
	}
}
