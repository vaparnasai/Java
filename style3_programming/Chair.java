package style3_programming;

public class Chair 
{
	private static String material = "Wood";
	private String type;

	public Chair(String type)
	{
		if (type.equals("office chair") || type.equals ("dinning chair") || type.equals ("reclainer chair"))
		{
			this.type = type;
		}
		else
		{
			System.err.println("Invalid chair type....");
		}
	}

	public void chairDetails()
	{
		System.out.println("***********************************************");
		System.out.println("The chair is made of material "+material);
		System.out.println("The chair is used as "+type);
		System.out.println("***********************************************");
	}
}

