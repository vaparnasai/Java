package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeSerialization 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("A15//Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student stu=(Student)ois.readObject();
			stu.display();//remove transient to display marks
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
