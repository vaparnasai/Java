package byte_oriented_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EvenDigits {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("A15//Qsp.txt")) {
			int len = fis.available();
			byte [] b = new byte[len];
			String s = null;
			int num=0;
			for (int i=0;i<=b.length-1;i++)
			{
				char ch = (char)fis.read();
				s=ch+"";
				num=Integer.parseInt(s);
				if(num%2==0)			
					  System.out.println(num);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
