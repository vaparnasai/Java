package com;

import java.util.Random;

public class PanCard {
	//Create a Static ref variable
		private static PanCard p =null;
		
		public int panNo;
		public String name;
		public int age;
		public long mobileNo;
		public char gender;
		//Random class for generating random number
		Random r = new Random();
		//Create private constructor
		private PanCard(String name ,int age,char gender)
		{
			this.name=name;
			this.age=age;
			this.mobileNo=r.nextLong(12345678902l);
			this.gender=gender;
			this.panNo=r.nextInt(123456);
			display();
		}
		//Create public static helper method
		public static PanCard createPanObject() 
		{
			if(p==null)
			{
				p=new PanCard("Scott",23,'M');
			    System.out.println("Pan Card object is created");
			}
			else
			{
				System.out.println("Already pan card object is created");
			}
			return p;
		}
		public void display()
		{
			System.out.println("Pan no:"+panNo);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Mobile No :"+mobileNo);
			System.out.println("Gender :"+gender);
			System.out.println("--------------------------");
		}
}
