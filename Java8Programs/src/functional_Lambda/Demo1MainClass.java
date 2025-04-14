package functional_Lambda;

public class Demo1MainClass {
public static void main(String[] args) {
	Demo1 d = (int a)->
	{
		System.out.println(a+5);
		System.out.println(a-5);
		System.out.println(a*5);
		return a;
	};
	d.test(10);
}
}
