package style3_programming_optimizing_topics_IOF;

public class Rectangle 
{
	private int length;
	private int width;
	private String color = "Blue";
	
	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color)
	{
		// validate later on
		this.length = length;
		this.width = width;
		this.color = color;
	}
	public void addColour()
	{
		System.out.println(color+" color...");
	}
	public void spin()
	{
		System.out.println("clockwise...");
	}
	public void findArea()
	{
		int area = length*width;
		System.out.println("Area :"+area);
	}
}
