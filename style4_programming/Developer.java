package style4_programming;

public class Developer extends Employee
{
	private String language;
	
	public Developer(int employeeId, String employeeName, int employeeSalary, int yearOfExperience, String language) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.yearOfExperience = yearOfExperience;
		this.language = language;
	}
	
	@Override
	public void yearlySalary()
	{
		long yearlySal= employeeSalary*12l;
		System.out.println("Yearly Salary of Developer is " +yearlySal);
	}
	@Override
	public void displayDetails()
	{
		displayDetails();
	}
	@Override
	public void assignWork()
	{
		System.out.println("The assigned work is Developer");
	}
	
}
