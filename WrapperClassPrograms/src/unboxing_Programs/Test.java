package unboxing_Programs;

public class Test {
	public static void main(String[] args) {
		int a =10;
		Integer i = new Integer(a);
		int res = i.intValue(); 
		System.out.println(res);
		
		char ch = 'a';
		Character c = new Character(ch);
		char ch1=c.charValue();//Explicit Unboxing
		System.out.println(ch1);
		
		double d = 11.2;
		Double d1=d;//implicit boxing
		double d2=d1;//implicit unboxing Jdk 1.5V
		System.out.println(d2);
	}
}
