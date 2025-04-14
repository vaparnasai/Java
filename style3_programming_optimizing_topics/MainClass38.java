package style3_programming_optimizing_topics;

abstract class Fath
{
	abstract public void farmHouse();
}
class Yu extends Fath
{
	@Override
	public void farmHouse()
	{
		System.out.println("completed");
	}
	
}
public class MainClass38 {
	public static void main(String[] args) {
		Fath f =(Fath)new Yu();
		f.farmHouse();
	}
}
