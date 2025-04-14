package style3_programming;

public class StudentClass 
{
	private static String schoolName = "ABC School";
	private String stdName;
	private int stdId;
	private double stdPercentage;
    
	public StudentClass (String stdName, int stdId , double stdPercentage )
	{
		boolean stdNameStatus = StudentValidation.nameValidation(stdName);
		if (stdNameStatus) 
		{
			this.stdName = stdName;
		}
		else
		{
			System.err.println("The given student name is invalid....");
		}	
		
		boolean stdIdStatus = StudentValidation.idValidation(stdId);
		if (stdIdStatus)
		{
			this.stdId = stdId;
		}
		else
		{
			System.err.println("The given student is invalid");
		}
		
		boolean stdPercentageStatus = StudentValidation.percentangeValidation(stdPercentage);
		if (stdPercentageStatus)
		{
			this.stdPercentage=stdPercentage;
		}
		else 
		{

			System.err.println("The given percentage is invalid");

		}
	}
	
	public double percentageConversion(double studentPerc) {

		double cgpa=studentPerc/10;

		return cgpa;

	}

	public void displayStudentDetails() {

		System.out.println("School Name is: "+schoolName);

		System.out.println("Student Name is : "+ stdName);

		System.out.println("Student id is : "+ stdId);

		System.out.println("Student marks in CGPA is : "+percentageConversion(stdPercentage));

		System.out.println("********************************************");

	}

	
}


		
