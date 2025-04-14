package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		File f = new File("FileNameText.txt");//file created in project or using Drives
		try {
			boolean res=f.createNewFile();
			System.out.println(res);
			FileWriter fw = new FileWriter(f);
			fw.write("ASDFGHJKL");
			fw.flush();
			fw.close();
			System.out.println("Data stored");
		} catch (IOException e) {
			System.out.println("Handled");
		}
	}
}
