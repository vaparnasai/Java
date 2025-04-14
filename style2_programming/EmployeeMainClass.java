package style2_programming;

public class EmployeeMainClass {
		public static void main(String[] args) {
		// create 2 objects
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		
		employee1.provideEmployeeDetails("Rani","EMP123",20000);
		employee1.employeeDetails();
		
		employee2.provideEmployeeDetails("Raii","E23123",30000);
		employee2.employeeDetails();
		
		

	}

}
