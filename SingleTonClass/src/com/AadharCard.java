package com;

public class AadharCard {
	//Create a Static ref variable
	private static AadharCard a =null;
	
	public long aadharNo;
	public String name;
	public int age;
	public String address;
	public char gender;
	//Create private constructor
	private AadharCard(long aadharNo,String name ,int age, String address ,char gender)
	{
		this.aadharNo=aadharNo;
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
		display();
	}
	//Create public static helper method
	public static void createAadharObject() 
	{
		if(a==null)
		{
			a=new AadharCard(944580992,"Scott",23,"Hyd",'M');
		    System.out.println("Aadhar card is created");
		}
		else
		{
			System.out.println("Aadhar card already exists");
		}
	}
	public void display()
	{
		System.out.println("AadharCard No:"+aadharNo);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
		System.out.println("Gender :"+gender);
		System.out.println("--------------------------");
	}
}
