package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainClass 
{
	public static void main(String[] args) {
		Student s = new Student("Scott",78,8);
		try {
			FileOutputStream fos = new FileOutputStream("A15//Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
