package character_oriented_programs;

public class FileMainClass 
{
	public static void insertData(FileClass f)
	{
		f.writeData();
		f.readData();
	}
	public static void main(String[] args)
	{
		insertData(new TextFile("Java"));
		insertData(new DocFile("SQL"));
	}
}
