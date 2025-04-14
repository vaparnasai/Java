package style3_programming_optimizing_topics_IOF;

public class Circle
{
	private final static double pi =3.14;
	private int radius;
	private String color = "Blue";
	
	public Circle(int radius) 
	{
		this.radius = radius;
	}
	
	public Circle(int radius, String color) 
	{
		// validate later on
		this.radius = radius;
		this.color = color;
	}

	public void fillColour()
	{
		System.out.println(color+" color...");
	}
	public void rotate()
	{
		System.out.println("clockwise...");
	}
	public void getArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area :"+area);
	}
}
