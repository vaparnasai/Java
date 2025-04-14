package style3_programming_optimizing_topics_IOF;

public class MainClass {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,5);
		Circle cir = new Circle(3);
		Triangle tri = new Triangle(10,12,"Light Green");
		rect.addColour();
		rect.spin();
		rect.findArea();
		cir.fillColour();
		cir.rotate();
		cir.getArea();
		tri.paint();
		tri.turn();
		tri.calculateArea();
	}
}
