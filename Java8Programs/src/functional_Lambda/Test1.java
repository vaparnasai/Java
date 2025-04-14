package functional_Lambda;

import java.util.function.Predicate;

public class Test1 
{
	public static void main(String[] args) {
		Predicate<Integer> p = (num)->num%2==0;
		System.out.println(p.test(11));
		
		Predicate<String> p1 = (str)->str.length()>4;
		System.out.println(p1.test("Java Developer"));
	}
}
