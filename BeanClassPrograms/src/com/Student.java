package com;

import java.io.Serializable;

public class Student implements Serializable
{
	private String name;
	private transient int marks;//Transient is used to avoid serialization of data members
	private int rollNo;
	
	private Student()
	{
		
	}

	public Student(String name, int marks, int rollNo) 
	{
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void display()
	{
		System.out.println("Name:"+getName());
		System.out.println("Marks:"+getMarks());
		System.out.println("Roll no:"+getRollNo());
	}
}
