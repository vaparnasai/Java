package style3_programming_optimizing_topics;

interface Sample4
{
	void move4();
}
interface Sample5 extends Sample4
{
	void move5();
}
interface Sample6 extends Sample5
{
	void move6();
}
class Demo3 implements Sample6
{
	@Override
	public void move4()
	{
		/* logic */
	}
	@Override
	public void move5()
	{
		/* logic */
	}
	@Override
	public void move6()
	{
		/* logic */
	}
}
public class MainClass18 {
	public static void main(String[] args) {
		Demo3 d3 = new Demo3();
		d3.move4();
		d3.move5();
		d3.move6();
	}
}
