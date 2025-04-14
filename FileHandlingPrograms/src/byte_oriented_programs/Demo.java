package byte_oriented_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.Arrays;

public class Demo 
{
	public static void main(String[] args) {
		//File f = new File("A15");
		//System.out.println(f.mkdir());
		try {
			FileOutputStream fos = new FileOutputStream("A15//Abc.txt",true);
			String s = "456";//ABCD
			byte [] b = s.getBytes();
			//System.out.println(Arrays.toString(b));//Just for our understanding of the internal implementation
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data stored");
		} catch (FileNotFoundException e) {
			System.out.println("Handled");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
