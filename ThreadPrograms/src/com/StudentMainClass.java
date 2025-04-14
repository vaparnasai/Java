package com;

public class StudentMainClass 
{
	public static void main(String[] args) {
		Trainer t = new Trainer();
		Student s = new Student("Sheela", t);
		Student s1 = new Student("Mala", t);
		Student s2 = new Student("Laila", t);
		s.start();
		s1.start();
		s2.start();
	}
}
