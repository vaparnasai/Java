package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		File f = new File("Ms18");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your friend name: ");
		String fname = sc.next();
		try {
			System.out.println(f.mkdir());
			File f1 = new File("Ms18//Word.doc");
			FileWriter fw = new FileWriter(f1,true);
			fw.write(name);
			fw.write(fname);
			fw.flush();
			System.out.println("Data stored...");
			//FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(new FileReader(f1));
			boolean res = new File("Ms18//Word.doc").exists();
			System.out.println(res);
			if(res==true)
			{
				/*long length = new File("Ms18//Word.doc").length();
				for (int i =0;i<=length-1;i++)
				{
					System.out.print((char)fr.read());
				}*/
				String data = br.readLine();
				System.out.println(data);
			}
			else
			{
				throw new FileNotPresent();
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("File is not present");
		}
		
	}
}
