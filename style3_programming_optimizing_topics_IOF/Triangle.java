package style3_programming_optimizing_topics_IOF;

public class Triangle 
{
	private int base;
	private int height;
	private String color = "Blue";
	
	public Triangle(int base, int height) 
	{
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base, int height, String color) 
	{
		// validate later on
		this.base = base;
		this.height = height;
		this.color = color;
	}

	public void paint()
	{
		System.out.println(color+" color...");
	}
	public void turn()
	{
		System.out.println("clockwise...");
	}
	public void calculateArea()
	{
		double area = 0.5*base*height;
		System.out.println("Area :"+area);
	}
}
