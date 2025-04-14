package style3_programming_optimizing_topics;

class Vehicle
{
	public void move()
	{
		System.out.println("Moving");
	}
}
class Bus extends Vehicle
{
	public void travel()
	{
		System.out.println("Travelling");
	}
}
class Train extends Vehicle
{
	public void transport()
	{
		System.out.println("Transporting goods");
	}
}
public class MainClass35 {
	public static void main(String[] args) {
		Vehicle vehicle1=(Vehicle)new Bus();
		vehicle1.move();
		Bus b = (Bus)vehicle1;
		b.move();
		b.travel();
		Vehicle vehicle2 = (Vehicle)new Train();
		Train t=(Train)vehicle2;
	}
}
