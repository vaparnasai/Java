package style3_programming_optimizing_topics;

abstract class QuestionPaper
{
	abstract public void question1();
}
class Student1 extends QuestionPaper
{
	public void question1()
	{
		System.out.println("Complete the question");
	}
}
class Student2 extends QuestionPaper
{
	public void question1()
	{
		System.out.println("Answer the question");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.question1();
		Student2 s2 = new Student2();
		s2.question1();
	}
}
