package style3_programming_optimizing_topics;

interface Sample7
{
	void move7();
}
interface Sample8 extends Sample7
{
	void move8();
}
interface Sample9 extends Sample7
{
	void move9();
}
// implementation for two class
class Demo4 implements Sample8
{
	@Override
	public void move7()
	{
		/*logic*/
	}
	@Override
	public void move8()
	{
		/*logic*/
	}
}
class Demo5 implements Sample9
{
	@Override
	public void move7()
	{
		/*logic*/
	}
	@Override
	public void move9()
	{
		/*logic*/
	}
}
// Single implementation
class Demo6 implements Sample8,Sample9
{
	@Override
	public void move7()
	{
		/*logic*/
	}
	@Override
	public void move8()
	{
		/*logic*/
	}
	@Override
	public void move9()
	{
		/*logic*/
	}
}

public class MainClass19 {
	public static void main(String[] args) {
		// 2 implementation is used when both are having different logics to implement
		Demo4 d4 = new Demo4();
		d4.move7();
		d4.move8();
		Demo5 d5 = new Demo5();
		d5.move7();
		d5.move9();
		// single implementation used when both implementation logic is same for move7()
		Demo6 d6 = new Demo6();
		d6.move7();
		d6.move8();
		d6.move9();
	}
}
