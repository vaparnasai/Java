package style4_programming;

public class Circle extends Shape
{
	private final static double pi =3.14;
	private int radius;
	
	public Circle(int radius) 
	{
		this.radius = radius;
	}
	
	public Circle(int radius, String color) 
	{
		// validate later on
		this(radius);
		this.color = color;
	}

	public void fill()
	{
		System.out.println(color+" color...");
	}
	public void rotate()
	{
		System.out.println("clockwise...");
	}
	public void findArea()
	{
		double area = pi*radius*radius;
		System.out.println("Area :"+area);
	}
}
