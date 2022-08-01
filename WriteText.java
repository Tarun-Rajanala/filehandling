package fileHandling;
import java.io.*;

public class WriteText {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String txt="Hi! Alexa";
				try 
				{
					FileWriter obj=new FileWriter("Demo.txt");
					obj.write(txt);
					System.out.println("The data is Written");
					obj.close();
				}
				catch(IOException i) 
				{
					System.out.println("Error! Occurs in writing data to file");
				}

			}

		}


	


