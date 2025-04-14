package ListPrograms;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name;
	private int id;
	private int sal;
	private String location;
	private String designation;
	public Employee() 
	{
		
	}
	public Employee(String name, int id, int sal, String location, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.location = location;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getSal() 
	{
		return sal;
	}
	public void setSal(int sal) 
	{
		this.sal = sal;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getDesignation() 
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public void display()
	{
		System.out.println("Employee name :"+getName());
		System.out.println("Employee id :"+getId());
		System.out.println("Employee salary :"+getSal());
		System.out.println("Employee location :"+getLocation());
		System.out.println("Employee designation :"+getDesignation());
	}
	@Override
	public String toString() {
		return "Employee \n name=" + name + "\n id=" + id + " \n sal=" + sal + " \n location=" + location + "\n designation="
				+ designation + "\n-------------------------------------------------------";
	}
	
	
	
}
