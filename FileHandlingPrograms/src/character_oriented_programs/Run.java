package character_oriented_programs;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File f = new File("Excel.xlxs");
		try 
		{
			System.out.println(f.createNewFile());
		} catch (IOException e) 
		{
			System.out.println("Handling...");
		}
	}
}
