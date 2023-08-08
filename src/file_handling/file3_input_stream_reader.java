package file_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class file3_input_stream_reader {

	public static void main(String[] args)throws IOException {
		
			FileInputStream file=new FileInputStream("C:\\Users\\pattu\\OneDrive\\Desktop\\list.txt");
			BufferedReader reader =new BufferedReader(new InputStreamReader(file));
			boolean line;
			while(line=reader.readLine()!=null)
{
	System.out.println(line);
}
reader.close();
file.close();
			
		

	}

}
