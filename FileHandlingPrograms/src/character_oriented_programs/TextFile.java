package character_oriented_programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile extends FileClass
{
	File f = new File("textFile.txt");
	public TextFile(String data) 
	{
		super(data);
	}
	@Override
	public void writeData()
	{
		//File f = new File("textFile.txt");
		try {
			System.out.println(f.createNewFile());
			FileWriter fr = new FileWriter(f);
			fr.write(data);
			fr.flush();
			fr.close();
			System.out.println("Data Stored");
		} catch (IOException e) {
			System.out.println("Handled");
		}
	}
	@Override
	public void readData()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String data = br.readLine();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
