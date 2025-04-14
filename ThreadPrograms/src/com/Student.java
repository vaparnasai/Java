package com;

public class Student extends Thread
{
	public String name;
	Trainer t;
	
	
	public Student(String name, Trainer t) 
	{
		this.name = name;
		this.t = t;
	}


	@Override
	public void run() 
	{

		t.askQuestion(name);
	}
}
