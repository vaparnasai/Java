public class RectangleMainClass 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		r1.l = 8;
		r2.l = 10;

		r1.w = 4;
		r2.w = 5;

		double area1 = r1.l*r1.w;
		double area2 = r2.l*r2.w;

		//double convert1 = area1/100;
		//double convert2 = area2/100;

		System.out.println("__________Rectangle1 Details__________");
		System.out.println("Colour of Rectangle1 : "+Rectangle.colour);
		System.out.println("Area of rectangle1 : " +area1);
		System.out.println("Convert area of rectangle1 from mm to cm : " +area1*Rectangle.convert);

		System.out.println("__________Rectangle2 Details__________");
		System.out.println("Colour of Rectangle2 : " +Rectangle.colour);
		System.out.println("Area of rectangle2 : " +area2);
		System.out.println("Convert area of rectangle2 from mm to cm : " +area2*Rectangle.convert);

	}
}
