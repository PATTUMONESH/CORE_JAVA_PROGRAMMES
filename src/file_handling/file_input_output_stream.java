package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class file_input_output_stream {

	public static void main(String[] args) {
		try
		{
    OutputStream os=new FileOutputStream("C:\\Users\\pattu\\OneDrive\\Desktop\\ABC.txt");
    os.write(10);
    os.write(20);
    os.write(30);
    os.write(40);
    os.write(50);
    
    os.close();
    System.out.println("data written successfully");
    
		}
		catch(IOException e)
		{
			System.out.println("exception.........");	
		}

	}

}
