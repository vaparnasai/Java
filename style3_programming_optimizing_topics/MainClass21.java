package style3_programming_optimizing_topics;

abstract class Sample13
{
	abstract public void move13();
}
interface Sample14
{
	void move14();
}
class Demo8 extends Sample13 implements Sample14
{
	@Override
	public void move13()
	{
		
	}
	@Override
	public void move14()
	{
		
	}
}

public class MainClass21 {
	public static void main(String[] args) {
		Demo8 d8 = new Demo8();
		d8.move13();
		d8.move14();
	}
}
