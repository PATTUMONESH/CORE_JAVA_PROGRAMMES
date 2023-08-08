package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file5_file_operation {

	public static void main(String[] args) throws IOException {
		File file=new File("foperation.txt");    //1.create a new file
//		try
//	{
//			file.createNewFile();
//			System.out.println("your file is created");
//			
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
    //2.write in to the file
//		try {
//			FileWriter fw=new   FileWriter("foperation.txt");
//			fw.write("hii this is my first file.............!!!the data is updated successfully");
//			System.out.println("data written in the file successfully");
//			fw.close();
//		}
//		catch(IOException e)
//		{
//       e.printStackTrace();
//		
//	}
		//3.read the file
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine());
			{
			String line=sc.nextLine();
			System.out.print(line);
			
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//4.delete the file
		if(file.delete())
		{
			System.out.print("i have deleted the file......."+file.getName());
		}
		else
		{
			System.out.print("error found in deleting the file");
		}
		//5.check file exist or not
		if(file.exists())
		{
			System.out.print("file exists!!");
			System.out.print("this name is alreadt present you can try aother one!!!");
		}
		else
		{
			
			System.out.print("file not exists ");
		}
}
}
