package style2_programming;

public class CircleMainClass 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.giveRadius(8);
		c1.circleInformation();
		System.out.println("--------------------------------------");
		c2.giveRadius(18);
		c2.circleInformation();
	}
}
