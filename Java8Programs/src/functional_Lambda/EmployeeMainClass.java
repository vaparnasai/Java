package functional_Lambda;

public class EmployeeMainClass 
{
	public static void main(String[] args) {
		Developer d = new Developer();
		d.login();
		d.bonus();
		d.work();
		d.sal();
		d.logout();
		System.out.println("---------------------");
		Tester t = new Tester();
		t.login();t.work();t.sal();t.logout();
		
	}
}
