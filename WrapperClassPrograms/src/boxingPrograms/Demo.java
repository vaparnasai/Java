package boxingPrograms;

public class Demo {
	public static void main(String[] args) {
		//explicit boxing
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(i);
		
		char ch = 'a';
		Character c = new Character(ch);
		System.out.println(c);
		
		//implicit boxing in Jdk 1.5V
		long l = 1234567890l;
		Long l1 = l;
		System.out.println(l); 
		
		double d = 10.23;
		Double d1=d;
		System.out.println(d1);
	}

}
