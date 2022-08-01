package fileHandling;

import java.io.*;
public class AppendFile {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt=". This is Tarun";
		try 
		{
			FileWriter obj=new FileWriter("Demo.txt",true);
			obj.write(txt);
			System.out.println("The data is appended");
			obj.close();
		}
		catch(IOException i) 
		{
			System.out.println("Error! Occurs in appending data to file");
		}

	}

}
