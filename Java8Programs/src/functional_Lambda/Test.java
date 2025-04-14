package functional_Lambda;

import java.util.function.Predicate;

public class Test implements Predicate<Integer>
{
	@Override
	public boolean test(Integer i) {
		if(i%2==0)
			return true;
		else
		    return false;
	}
	public static void main(String[] args) {
		Test t = new Test();
		boolean res = t.test(10);
		System.out.println(res);
	}
}
