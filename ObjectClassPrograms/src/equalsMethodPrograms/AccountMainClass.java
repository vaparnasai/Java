package equalsMethodPrograms;

public class AccountMainClass {
	public static void main(String[] args) {
		Account a1 = new Account(9854,"Sham",685457,100);
		a1.accountDetails();
		Account a2 = new Account(5489,"Ram",545712,1000);
		System.out.println(a2);
		boolean res1= a1.equals(a2);
		System.out.println(res1);
	}
}
