package style4_programming;

import java.util.Scanner;

public class ShapeMainClass {
	private static Scanner scan = new Scanner(System.in);
	private static Shape shape;
	public static void main(String[] args) 
	{
		int status =0;
		do
		{
			System.out.println("Press 1 for Rectangle functionality...");
			System.out.println("Press 2 for Circle functionality...");
			System.out.println("Press 3 for Triangle functionality...");
			System.out.println("Enter a choice...");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:gatherRectangleData();
			break;
			case 2:gatherCircleData();
			break;
			case 3:gatherTriangleData();
			break;
			}
			status =1;
			try
			{
				shape.fill();
				shape.rotate();
				shape.findArea();
			}
			catch(NullPointerException e)
			{
				System.out.println("Invalid shape");
				status =0;
			}
		}
		while(status==0);
	}
	public static void gatherRectangleData()
	{
		System.out.println("Enter the length...");
		System.out.println("Enter the width...");
		int length = scan.nextInt();
		int width = scan.nextInt();
		System.out.println("Enter 1 for Rectangle without colour"); 
		System.out.println("Enter 2 for Rectangle with colour"); 
		int option = scan.nextInt();
		if(option==1)
		{
			shape = (Shape)new Rectangle(length,width);
		}
		else
		{
			System.out.println("Enter the color :");
			String color = scan.next();
			shape = (Shape)new Rectangle(length,width,color);
		}
		
	}
	public static void gatherCircleData()
	{
		System.out.println("Enter the radius...");
		int radius = scan.nextInt();
		System.out.println("Enter 1 for Circle without colour"); 
		System.out.println("Enter 2 for Circle with colour"); 
		int option = scan.nextInt();
		if(option==1)
		{
			shape = (Shape)new Circle(radius);
		}
		else
		{
			System.out.println("Enter the color :");
			String color = scan.next();
			shape = (Shape)new Circle(radius,color);
		}
	}
	public static void gatherTriangleData()
	{
		System.out.println("Enter the base...");
		System.out.println("Enter the height...");
		int base = scan.nextInt();
		int height = scan.nextInt();
		System.out.println("Enter 1 for Triangle without colour"); 
		System.out.println("Enter 2 for Triangle with colour"); 
		int option = scan.nextInt();
		if(option==1)
		{
			shape = (Shape)new Triangle(base,height);
		}
		else
		{
			System.out.println("Enter the color :");
			String color = scan.next();
			shape = (Shape)new Triangle(base,height,color);
		}
	}
}
