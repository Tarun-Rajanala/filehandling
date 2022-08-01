package fileHandling;
import java.io.*;

public class ReadTheFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		char[] txt=new char[25];
		try {
			FileReader obj=new FileReader("Demo.txt");
			obj.read(txt);
			System.out.println("Data Readed");
			System.out.println(txt);
			obj.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error in reading file");
		}
		

	}

}
