package character_oriented_programs;

public class FileClass
{
	String data;

	public FileClass(String data) 
	{
		this.data = data;
	}
	public void writeData()
	{
		System.out.println("Writing data into a file");
	}
	public void readData()
	{
		System.out.println("Reading data into a file");
	}
}
