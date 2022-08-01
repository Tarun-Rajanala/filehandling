package fileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File my=new File("Demo.txt");
		try {
			if(my.createNewFile()) 
			{
				System.out.println("New file created Successfully");
			}
			else
			{
			   System.out.println("Error occurs in creating file!");	
			}
		}catch(IOException i) {
			i.printStackTrace();
		}
		

	}

}
