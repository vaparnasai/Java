package style3_programming_optimizing_topics;

interface Sample15
{
	void move15();
}
class Demo9 implements Sample15
{
	@Override
	public void move15()
	{
		//logic
	}
}
class Demo10 implements Sample15
{
	@Override
	public void move15()
	{
		
	}
}
public class MainClass22 {
	public static void main(String[] args) {
		Demo9 d9 = new Demo9();
		d9.move15();
		Demo10 d10 = new Demo10();
		d10.move15();
	}
}
