package style4_programming;

public class Rectangle extends Shape
{
	private int length;
	private int width;
	
	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color)
	{
		// validate later on
		this(length,width);
		this.color = color;
	}
	@Override
	public void fill()
	{
		System.out.println(color+" color...");
	}
	@Override
	public void rotate()
	{
		System.out.println("clockwise...");
	}
	@Override
	public void findArea()
	{
		int area = length*width;
		System.out.println("Area :"+area);
	}
}
