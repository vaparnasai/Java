package byte_oriented_programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SumOfChar 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("A15//Qsp.txt");
			int len = fis.available();
			byte [] b = new byte[len];
			String s = null;
			int num=0;
			int sum=0;
			for(int i=0;i<=b.length-1;i++)
			{
				char ch = (char)fis.read();				
				s = ch+ "";
				num = Integer.parseInt(s);
				sum=sum+num;
			}
			System.out.println(sum);	
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
