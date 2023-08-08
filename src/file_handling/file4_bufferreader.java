package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file4_bufferreader {

	public static void main(String[] args) throws IOException {
		
		FileReader freader=new FileReader("C:\\Users\\pattu\\OneDrive\\Desktop\\list.txt");
		BufferedReader breader=new BufferedReader(freader);
		int records;
		while((records=breader.read())!=-1)
		{
			System.out.print((char)records);
		}
		breader.close();
		freader.close();

	}

}
