package com;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name;
	private int id;
	private int sal;
	
	public Employee()
	{
		
	}

	public Employee(String name, int id, int sal) 
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	//Setter method for name
	public void setName(String name)
	{
		this.name=name;
	}
	//Getter method for name
	public String getName(String name)
	{
		return name;
	}
	//Setter method for id
		public void setId(int id)
		{
			this.id=id;
		}
	//Getter method for id
	public int getId(int id)
	{
		return id;
	}
	//Setter method for sal
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	//Getter method for sal
	public int getSal(int sal)
	{
		return sal;
	}
	
	public void display()
	{
		System.out.println("Employee name: "+getName(name) );
		System.out.println("Employee id: "+getId(id) );
		System.out.println("Employee sal: "+getSal(sal) );
	}

}
