package file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file6_file_operation {

	public static void main(String[] args) {
		
            String filename;
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the file name for creating a new file" );
            filename=sc.next();
            
            File file=new File("C:\\Users\\pattu\\OneDrive\\Desktop\\"+filename+".txt");
            try
            {
            	//file.createNewFile();
//            	if(file.createNewFile())
//            	{
//            		System.out.print("your file created successfully" );
//            	}
//            	else
//            	{
//            		if(file.exists())
//            		{
//            			System.out.print("file already exists" );
//            		}
//            	}
            	if(file.exists())
            	{
            		System.out.print("file exists" );
            		System.out.println("you can try with another name" );
            	}
            	else
            	{
            		file.createNewFile();
            		System.out.print("file creared successfully" );
            		
            	}
            }
            catch(IOException E) {
            	E.printStackTrace();
            }
	}

}
