package character_oriented_programs;

import java.io.File;
import java.io.IOException;

public class Sample 
{
	public static void main(String[] args) 
	{
		File f = new File("Qsp.doc");
		try 
		{
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) 
		{
			System.out.println("Handling...");
		}
	}
}
