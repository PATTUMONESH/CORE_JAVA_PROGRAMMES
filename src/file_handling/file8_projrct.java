package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file8_projrct {

	public static void main(String[] args) throws IOException {
		char ch;

		Scanner sc = new Scanner (System.in);

		
		
		 boolean quit = true;
		 
		 while(quit)
		 {
			do
			{
			System.out.println("1. file creation ");
			System.out.println("2. writting operation ");
			System.out.println("3. reading a file ");
			System.out.println("4. delete file ");
			System.out.println("5. exit");
			
			System.out.println("enter your choice");
			
          int choice= sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter file name to create");
				String filename = sc.next();

				File directory = new File("C:\\Users\\pattu\\OneDrive\\Desktop" +filename+".txt");
				
				if(directory.createNewFile())
				{
					System.out.println("File "+filename+" created successfully");
					
					
				}
				else
				{
					if(directory.exists())
					{
						System.out.println("File with name "+filename+" Already exist");
					}
					else
					{
						System.out.println("ERROR in creating "+filename+" file");
					}
				}
				
				break;
				
         case 2:
				
        	 
        	 String f2;
        	 System.out.println("enter file name where you want to write the data!!");
        	 f2=sc.next();
				FileWriter fw = new FileWriter("C:\\Users\\pattu\\OneDrive\\Desktop"+f2+".txt");
				
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Type the Content here :");
				String content = sc1.nextLine();
				
				fw.write(content);
				
				System.out.println("Data written succefully in "+f2);
				fw.close();
				
				break;
				
         case 3:
        	 
        	 System.out.println("enter file name whose data you wanna read!!");
    		 String f3=sc.next();
        	 try
        	 {
        	 
        		 File d2 = new File("C:\\Users\\pattu\\OneDrive\\Desktop"+f3+".txt");
        		 Scanner sc2 = new Scanner(d2);
        		 
        		 while(sc2.hasNextLine())
        		 {
        			 String line = sc2.nextLine();
        			 System.out.println(line);
        		 }
        		 
        		 sc2.close();
        	 }
        	 catch (Exception e) {
				e.printStackTrace();
			}
        	 
        	 break;
				
				
         case 4:
        	 
        	 System.out.println("enter file name whose data you wanna read!!");
    		 String f4=sc.next();
    		 
    		 File d1 = new File("C:\\Users\\pattu\\OneDrive\\Desktop"+f4+".txt");
				
				if(d1.delete())
					{
						System.out.println(d1.getName()+" deleted Successfully");
					}
					else
					{
						System.out.println("error found in deleting the file");
					}
				
				break;
         case 5:
				
				quit=false;
				
				break;
				
			default:
				
				System.out.println("your choice is incorrect. ");
				
			}
			
			System.out.println("do you want to continue(y/n)");
			 ch= sc.next().charAt(0);
			 System.out.println("Thakyou for using my application....!!!"); 
		
			}
			
			while(ch=='Y'|| ch=='y');
			
			System.out.println("Thakyou for using my application....!!!");

		 }
		 
	}


}