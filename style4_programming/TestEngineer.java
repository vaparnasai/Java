package style4_programming;

public class TestEngineer extends Employee
{
	private String testingType;
	
	public TestEngineer(int employeeId, String employeeName, int employeeSalary, int yearOfExperience,
			String testingType) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.yearOfExperience = yearOfExperience;
		this.testingType = testingType;
	}
	

	@Override
	public void yearlySalary()
	{
		long yearlySal= employeeSalary*12l;
		System.out.println("Yearly Salary of Test Engineer is " +yearlySal);
	}
	@Override
	public void displayDetails()
	{
		displayDetails();
	}
	@Override
	public void assignWork()
	{
		System.out.println("The assigned work is Test Engineer");
	}
	
	
}
