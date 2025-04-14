package ListPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainClass 
{
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Scott", 5, 80000, "Hyd", "Java Developer");
		Employee emp2 = new Employee("King", 2, 50000, "Blr", "Tester");
		Employee emp3 = new Employee("Allen", 7, 35000, "Pune", "Clerk");
		//ArrayList al = new ArrayList();
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		//for (int i =0;i<=al.size()-1;i++)
		for(Employee e:al)
		{
			//Object emp=al.get(i);
			//Employee e =(Employee)emp;
			//before using for each loop we can use this for generics
			//Employee e = al.get(i);
			if (e.getDesignation().equalsIgnoreCase("Java Developer"))
			{
				System.out.println("Name :"+e.getName());
				System.out.println("Location :"+e.getLocation());
			}
		}
		System.out.println("--------------------------------------");
		//for (int i=0;i<=al.size()-1;i++)
		/*for(Employee emp:al)
		{*/
			//Employee emp =(Employee)al.get(i);
			//before using for each loop we can use this for generics
			//Employee emp =al.get(i);
			/*if(emp.getSal()>50000)
			{
				emp.display();
			}
		}*/
		List<Employee> li = al.stream().filter((e)->e.getSal()>45000).collect(Collectors.toList());
		System.out.println(li);
	}
}
