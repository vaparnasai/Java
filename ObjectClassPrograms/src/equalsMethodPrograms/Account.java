package equalsMethodPrograms;

public class Account {
	public int accountNo;
	public String accountHolderName;
	public long ifscCode;
	public int accountBalance;
	
	public Account(int accountNo, String accountHolderName,long ifscCode,int accountBalance)
	{
		this.accountNo=accountNo;
		this.accountHolderName=accountHolderName;
		this.ifscCode=ifscCode;
		this.accountBalance=accountBalance;
	}
	@Override
	public String toString()
	{
		return "Account number :"+ accountNo + " Account Balance :"+ accountBalance;
		
	}
	public void accountDetails()
	{
		System.out.println("Account Number :"+accountNo);
		System.out.println("Account holder name is :" +accountHolderName);
		System.out.println("IFSC Code :" +ifscCode);
		System.out.println("Account Balance :" +accountBalance);
		System.out.println("-----------------------------------");
	}
}
