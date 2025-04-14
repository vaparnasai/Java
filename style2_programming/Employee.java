package style2_programming;

public class Employee {
	private  String empName;
	private String empId;
	private long empSalary;
	



public void provideEmployeeDetails(String empName , String empId,long empSalary)
{
	boolean employeeNameValidationStatus= EmployeeValidation.employeeNameValidation(empName);
	if(employeeNameValidationStatus)
	{
		this.empName=empName;
	}
	else
	{
		System.err.println("invalid employee name.....");
	}
	
	
	boolean employeeIdValidationStatus=EmployeeValidation.employeeIdValidation(empId);
	if(employeeIdValidationStatus)
	{
		this.empId=empId;
	}
	else
	{
		System.err.println("invalid employee id.....");
	}
	
	
	boolean employeeSalaryValidationStatus=EmployeeValidation.employeeSalaryValidation(empSalary);
	if(employeeSalaryValidationStatus)
	{
		this.empSalary=empSalary;
	}
	else
	{
		System.err.println("invalid employee salary...");
	}
}


public long AnnualSalaryOfEmployee(long empSalary)
{
	return (empSalary*12);
}

public void employeeDetails()
{
	System.out.println("======================================================================");
	System.out.println("Employee Name : "+empName);
	System.out.println("Employee Id : "+empId);
	System.out.println(empName +" will get salary "+empSalary+" rs/- per month");
	System.out.println(empName +"'s annual salary is : "+AnnualSalaryOfEmployee(empSalary));
	System.out.println("======================================================================");
	
}




}
