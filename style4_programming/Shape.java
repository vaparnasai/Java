package style4_programming;

public abstract class Shape 
{
	protected static String color = "Blue";
	public void fill()
	{
		System.out.println(color+ " color...");
	}
	abstract public void rotate();
	abstract public void findArea();
}
