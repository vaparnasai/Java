package style3_programming;

public class Balloon
{
	private static String gasType = "Helium";
	private String colour;

	public Balloon(String z)
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
