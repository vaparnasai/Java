package style2_programming;

public class ChairMainClass 
{
	public static void main(String[] args) 
	{
		Chair c1 = new Chair();
		Chair c2 = new Chair();
		c1.provideChairDetail("office chair");
		c1.chairDetails();
		c2.provideChairDetail("reclainer chair");
		c2.chairDetails();
	}
}
