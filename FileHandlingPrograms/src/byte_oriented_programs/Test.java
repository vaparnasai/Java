package byte_oriented_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("A15//Jsp.txt");
			int len = fis.available();
			byte [] b = new byte[len];
			for (int i=0;i<=b.length-1;i++)
			{
				System.out.print((char)fis.read());;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
