package functional_Lambda;

public class Developer implements Employee
{

	@Override
	public void login() {
		System.out.println("10 am");
	}

	@Override
	public void work() {
		System.out.println("Developing applications");
		
	}

	@Override
	public void sal() {
		System.out.println("50k p/m");
	}

	@Override
	public void logout() {
		System.out.println("10pm");
	}

	@Override
	public void bonus() {
		System.out.println("10k p/m");
	}
	
}
