package ListPrograms;

import java.util.ArrayList;

public class StudentMainClass 
{
	public static void main(String[] args) {
		Student s1 = new Student("Vandy", 2, 90, 'F','B' );
		Student s2 = new Student("Nikki", 4, 89, 'F', 'A');
		Student s3 = new Student("Ram", 8, 70, 'M', 'B');
		Student s4 = new Student("Balu", 7, 30, 'M', 'A');
		//ArrayList al = new ArrayList();
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		//for (int i=0;i<=al.size()-1;i++)
		for (Student s : al)
		{
			//Student s = (Student)al.get(i);
			//Student s = al.get(i);
			if(s.getGender()=='F'&&s.getSection()=='B')
			{
				System.out.println("Name:"+s.getName());
			}
			System.out.println("----------------------------------");
			if(s.getMarks()>75)
			{
				System.out.println("Name :"+s.getName());
				System.out.println("RollNo :"+s.getRollNo());
				System.out.println("Section :"+s.getSection());
			}
			if(s.getName().equals("Ram"))
			{
			  s.setMarks(95);
			}
			if(s.getMarks()<45)
			{
				al.remove(s);
			}
		}
		//Student stu = (Student)al.get(0);
		Student stu = al.get(0);
		int marks = stu.getMarks();
		String name=stu.getName();
		//for (int i=0;i<=al.size()-1;i++)
		for (Student student : al)
		{
			//Student student = (Student)al.get(i);
			//Student student = al.get(i);
			if(student.getMarks()>marks)
			{
				marks = student.getMarks();
				name = student.getName();
			}
		}
		System.out.println("Name of the topper :"+name);
		System.out.println("Marks :"+marks);
	}
}
