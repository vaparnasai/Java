package style2_programming;

/* Write a program for the below requirements
a. program for balloon
   -Balloon properties are:
     1.Colour
     2.Gas type
   -Requirement:
     1.All the balloons are filled with Helium gas.
     2.Ballon colours can be white or blue or gold or silver or red.
   -Perform below operations:
     1.Initialize accordingly
     2.Display balloon details
     3.Create a balloon main class with main method
     4.Create 4 balloon objects 
     5.Call the functionalities
*/
public class Balloon
{
	private static String gasType = "Helium";
	private String colour;

	public void initialize (String z)
	{
		if (z.equals("white") || z.equals ("blue") || z.equals("gold") || z.equals("silver") || z.equals("red"))
		{
			colour = z;
		}
		else
		{
			System.err.println("Invalid colour...");
		}
	}

	public void balloonDetails()
	{
		System.out.println(colour +" balloon is filled with "+gasType +"gas");
	}
}
