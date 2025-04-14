import java.util.Scanner;
class  GradeResult
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your grade : ");
		char grade = sc.next().charAt(0);
		switch (grade)
		{
		case 'A':case 'a':System.out.println("You got first rank");
		break;
		case 'B':case 'b':System.out.println("You got second rank");
		break;
		case 'C':case 'c':System.out.println("You got first class");
		break;
		case 'D':case 'd':System.out.println("You got second class");
		break;
		case 'E':case 'e':System.out.println("You got just pass");
		break;
		case 'F':case 'f':System.out.println("You got failed in the exam");
		break;
		default :System.out.println("Enter a valid grade");
		
		}
	}
}
