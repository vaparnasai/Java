package style3_programming_optimizing_topics;

abstract class A
{
	abstract public void test();
	abstract public void run();
}
class B extends A
{
	public void test()
	{
		System.out.println("testing");
	}
	public void run()
	{
		System.out.println("running");
	}
}
public class MainClass4 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.run();
		b.test();
	}
}