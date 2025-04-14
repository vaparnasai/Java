package style2_programming;

public class BalloonMainClass 
{
	public static void main(String[] args) 
	{
		Balloon b1 = new Balloon();
		Balloon b2 = new Balloon();
		Balloon b3 = new Balloon();
		Balloon b4 = new Balloon();

		b1.initialize("white");
		b1.balloonDetails();
		b2.initialize("blue");
		b2.balloonDetails();
		b3.initialize("brown");
		b3.balloonDetails();
		b4.initialize("gold");
		b4.balloonDetails();
		
	}
}
