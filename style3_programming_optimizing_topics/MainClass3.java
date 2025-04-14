package style3_programming_optimizing_topics;

abstract class AsifNotes
{
	abstract public void topic15();
	abstract public void topic20();
}
abstract class JamesNotes extends AsifNotes
{
	@Override
	public void topic15()
	{
		System.out.println("completed by james..");
	}
}
class RajuNotes extends JamesNotes
{
	@Override
	public void topic20()
	{
		System.out.println("completed by raju..");
	}
}
public class MainClass3 
{
	public static void main(String[] args) {
		RajuNotes rn = new RajuNotes();
		rn.topic15();
		rn.topic20();
	}

}
