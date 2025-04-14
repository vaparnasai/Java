package style2_programming;

public class StudentMainClass 
{
	public static void main(String[] args) 
	{
		StudentClass student1=new StudentClass();

		StudentClass student2=new StudentClass();

		student1.provideStudentDetails("Ramu",4567,82);

		student2.provideStudentDetails("Ravi",4568,88.4);

		student1.displayStudentDetails();

		student2.displayStudentDetails();

	}

}

