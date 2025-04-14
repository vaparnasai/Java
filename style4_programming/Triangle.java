package style4_programming;

public class Triangle extends Shape
{
	private int base;
	private int height;
	
	public Triangle(int base, int height) 
	{
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base, int height, String color) 
	{
		// validate later on
		this(base,height);
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
		double area = 0.5*base*height;
		System.out.println("Area :"+area);
	}
}
