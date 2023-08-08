package file_handling;

import java.io.File;
import java.io.IOException;

public class file1 {

	public static void main(String[] args) throws IOException {
	
		 File newfile =new File("mynewfile.txt");
		 if(newfile.createNewFile())
		 {
			 System.out.println("file created");
		 }
		 else
		 {
			 System.out.println("file already exists");	 
		 }

	}

}
