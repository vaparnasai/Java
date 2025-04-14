package style3_programming_optimizing_topics;
/*Interface extends interface*/
interface Sample2
{
	void move2();
}
interface Sample3 extends Sample2
{
	void move3();
}
/*class implements interface*/
class Demo2 implements Sample3
{
	@Override
	public void move2()
	{
		/*logic*/
	}
	@Override
	public void move3()
	{
		/*logic*/
	}
	
}
public class MainClass17 {
	public static void main(String[] args) {
		Demo2 demo2 = new Demo2();
		demo2.move2();
		demo2.move3();
	}
}
