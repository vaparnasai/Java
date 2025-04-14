package style3_programming_optimizing_topics;
 /* abstract class can have combination of CM and AM */
abstract class I
{
	public void rise()
	{
		System.out.println("sunrise...");
	}
	abstract public void set();
}
class J extends I
{
	@Override
	public void set()
	{
		System.out.println("sunset...");
	}
}

public class MainClass14 {
	public static void main(String[] args) {
		J j1 = new J();
		j1.rise();
		j1.set();
	}
}
