package style2_programming;

/*
Write a program for the below requirements
 a. program for chair
      - Chair properties are:
         1.Material
         2.Type
      -Data Requirement :
         1.All the chairs are manufactured by using wood material
         2.Chair type can be office chair or dinning chair or reclainer
      -Perform below operations:
         1.Initialize accordingly
         2.Display Chair Details
*/
public class Chair 
{
	private static String material = "Wood";
	private String type;

	public void provideChairDetail (String type)
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

