package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo 
{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Ms13//Jsp.txt");
			long length = new File("Ms13//Jsp.txt").length();
			for (int i=0;i<=length-1;i++)
			{
				try {
					System.out.print((char)fr.read());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is Not Present");
		}
	}
}
