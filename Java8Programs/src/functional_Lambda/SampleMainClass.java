package functional_Lambda;

public class SampleMainClass 
{
	public static void main(String[] args) {
		Sample s = ()->System.out.println("Running");
		s.run();
	}
}
