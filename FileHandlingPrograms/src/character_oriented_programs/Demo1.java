package character_oriented_programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 
{
	public static void main(String[] args) {
		File f = new File("ABC.txt");
		try {
			System.out.println(f.createNewFile());
			FileWriter fr = new FileWriter(f,true);
			fr.write("|| DBA");
			fr.flush();
			fr.close();
			System.out.println("Data Stored");
		} catch (IOException e) {
			System.out.println("Handled");		
			}
	}
}
