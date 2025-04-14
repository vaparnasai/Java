package ListPrograms;

import java.io.Serializable;

public class Student implements Serializable
{
	private String name;
	private int rollNo;
	private int marks;
	private char gender;
	private char section;
	public Student() 
	{
		
	}
	
	
	
	public Student(String name, int rollNo, int marks, char gender, char section) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.gender = gender;
		this.section = section;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public int getMarks() {
		return marks;
	}



	public int setMarks(int marks) {
		return this.marks = marks;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public char getSection() {
		return section;
	}



	public void setSection(char section) {
		this.section = section;
	}



	public void display()
	{
		System.out.println("Student name :"+getName());
		System.out.println("Roll no :"+getRollNo());
		System.out.println("Marks :"+getMarks());
		System.out.println("Gender :"+getGender());
		System.out.println("Section :"+getSection());
	}
	@Override
	public String toString() {
		return "Student \n name=" + name + " \n rollNo=" + rollNo + " \n marks=" + marks + 
				"\n gender=" + gender + " \n section="
				+ section + "\n-------------------------------------------";
	}
	
	
}
