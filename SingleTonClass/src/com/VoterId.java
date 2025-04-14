package com;

import java.util.Random;

public class VoterId {
	//Create a Static ref variable
		private static VoterId v =null;
		
		public long voterId;
		public String name;
		public int age;
		public long mobileNo;
		public char gender;
		//Random class for generating random number
		Random r = new Random();
		//Create private constructor
		private VoterId(String name ,int age,char gender)
		{
			this.name=name;
			this.age=age;
			this.mobileNo=r.nextLong(12345678902l);
			this.gender=gender;
			this.voterId=r.nextInt(123456);
			display();
		}
		//Create public static helper method
		public static VoterId createVoterObject() 
		{
			if(v==null)
			{
				v=new VoterId("Scott",23,'M');
			    System.out.println("Voter Id object is created");
			}
			else
			{
				System.out.println("Already Voter id object is created");
			}
			return v;
		}
		public void display()
		{
			System.out.println("VoterId:"+voterId);
			System.out.println("Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Mobile No :"+mobileNo);
			System.out.println("Gender :"+gender);
			System.out.println("--------------------------");
		}
}
