package style3_programming_optimizing_topics_IOF;

class M
{
	public void fly() 
	{
		System.out.println("fly in sky8");
	}
}
class N extends M
{
	public void swim()
	{
		System.out.println("swim in river");
	}
}
class O extends N
{
	@Override
	public void fly()
	{
		System.out.println("fly in space");
	}
	public void activity()
	{
		System.out.println("Perform the activity");
		fly();
		swim();
	}
	
}
public class MainClass5 {
	public static void main(String[] args) {
		O o1 = new O();
		o1.activity();
	}
}
