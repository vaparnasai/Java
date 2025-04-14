package style3_programming_optimizing_topics;

interface Sample10
{
	void move10();
}
interface Sample11
{
	void move11();
}
interface Sample12 extends Sample10,Sample11
{
	void move12();
}

class Demo7 implements Sample12
{
	@Override
	public void move10()
	{
		//logic
	}
	@Override
	public void move11()
	{
		//logic
	}
	@Override
	public void move12()
	{
		//logic
	}
}
public class MainClass20 {
	public static void main(String[] args) {
		Demo7 d7 = new Demo7();
		d7.move10();
		d7.move11();
		d7.move12();
	}
}
