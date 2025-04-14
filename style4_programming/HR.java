package style4_programming;

public class HR extends Employee
{
	private String hrMode;

	public HR(int employeeId, String employeeName, int employeeSalary, int yearOfExperience, String hrMode) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.yearOfExperience = yearOfExperience;
		this.hrMode = hrMode;
	}
	@Override
	public void yearlySalary()
	{
		long yearlySal= employeeSalary*12l;
		System.out.println("Yearly Salary of HR is " +yearlySal);
	}
	@Override
	public void displayDetails()
	{
		displayDetails();
	}
	@Override
	public void assignWork()
	{
		System.out.println("The assigned work is HR ");
	}
	
}
