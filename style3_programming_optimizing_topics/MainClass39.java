package style3_programming_optimizing_topics;

interface TT
{
	void move();
}
class WW implements TT
{
	@Override
	public void move()
	{
		System.out.println("implemented...");
	}
}
public class MainClass39 {
	public static void main(String[] args) {
		TT tt = (TT)new WW();
		tt.move();
	}
}
