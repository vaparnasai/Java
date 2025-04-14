package functional_Lambda;

public class Tester implements Employee
{

	@Override
	public void login() {
		System.out.println("10 am");
		
	}

	@Override
	public void work() {
		System.out.println("Testing applications");
		
	}

	@Override
	public void sal() {
		System.out.println("40k p/m");
		
	}

	@Override
	public void logout() {
	System.out.println("6pm");
	}
	
}
