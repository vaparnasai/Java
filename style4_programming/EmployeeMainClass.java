package style4_programming;

import java.util.Scanner;

public class EmployeeMainClass 
{
	private static Scanner scan = new Scanner(System.in);
		private static Employee employee;
		public static void main(String[] args) 
		{
			int status =0;
			do
			{
				System.out.println("Press 1 for Developer");
				System.out.println("Press 2 for TestEngineer");
				System.out.println("Press 3 for HR");
				System.out.println("Enter a choice...");
				int choice = scan.nextInt();
				switch(choice)
				{
				case 1:gatherDeveloperData();
				break;
				case 2:gatherTestEngineerData();
				break;
				case 3:gatherHRData();
				break;
				}
				status =1;
				try
				{
					employee.yearlySalary();;
					employee.displayDetails();;
					employee.assignWork();;
				}
				catch(NullPointerException e)
				{
					System.out.println("Invalid employee");
					status =0;
				}
			}
			while(status==0);
		}
		public static void gatherDeveloperData()
		{
			System.out.println("Enter the employee id :");
			System.out.println("Enter the employee name :");
			System.out.println("Enter the employee salary :");
			System.out.println("Enter the years of experience :");
			int id = scan.nextInt();
			String name = scan.next();
			int sal = scan.nextInt();
			int years = scan.nextInt();
			System.out.println("Enter the language ");
			String language = scan.next();
			employee = (Employee)new Developer(id,name,sal,years,language);
		}
		public static void gatherTestEngineerData()
		{
			System.out.println("Enter the employee id ");
			System.out.println("Enter the employee name ");
			System.out.println("Enter the employee salary ");
			System.out.println("Enter the years of experience ");
			int id = scan.nextInt();
			String name = scan.next();
			int sal = scan.nextInt();
			int years = scan.nextInt();
			System.out.println("Enter the testing type...");
			int testingType = scan.nextInt();
			System.out.println("Enter 1 for Manual Testing"); 
			System.out.println("Enter 2 for Automated Testing"); 
			int option = scan.nextInt();
			if(option==1)
			{
				System.out.println("Enter the color :");
				String type = scan.next();
				employee = (Employee)new TestEngineer(id,name,sal,years,type);
			}
			else
			{
				System.out.println("Enter the testing type :");
				String type = scan.next();
				employee = (Employee)new TestEngineer(id,name,sal,years,type);
			}
		}
		public static void gatherHRData()
		{
			System.out.println("Enter the employee id ");
			System.out.println("Enter the employee name ");
			System.out.println("Enter the employee salary ");
			System.out.println("Enter the years of experience ");
			int id = scan.nextInt();
			String name = scan.next();
			int sal = scan.nextInt();
			int years = scan.nextInt();
			System.out.println("Enter the testing type...");
			int type = scan.nextInt();
			System.out.println("Enter 1 for Employee relationship with HR"); 
			System.out.println("Enter 2 for Resource Hiring HR"); 
			int option = scan.nextInt();
			if(option==1)
			{
				System.out.println("Enter the color :");
				String type = scan.next();
				employee = (Employee)new TestEngineer(id,name,sal,years,type);
			}
			else
			{
				System.out.println("Enter the color :");
				String type = scan.next();
				employee = (Employee)new TestEngineer(id,name,sal,years,type);
			}
		}
}
