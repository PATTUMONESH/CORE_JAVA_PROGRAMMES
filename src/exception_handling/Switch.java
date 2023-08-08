package exception_handling;

import java.util.Scanner;
class myexception extends Exception
{
	public String tostring()
	{
		return "your values are not correct check them again";
		
	}
}



public class Switch {
	

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ");
		a= sc.nextInt();
		
		System.out.println("enter the value of b ");
		b= sc.nextInt();
		
		boolean go=true;
		
		while(go)
		{
			System.out.println("enter your choice between [1 to 5]");
			System.out.println("press 1 for addition");
			System.out.println("press 2 for subtraction");
			System.out.println("press 3 for multiplication");
			System.out.println("press 4 for division");
			System.out.println("press 5 for modulas");
			System.out.println("press 6 for exit");

	try {
		
		int ch;
		
		ch= sc.nextInt();
switch(ch)
		{
		case 1: System.out.println("sum ="+(a+b));
			break;
		
		case 2: System.out.println("subtraction="+(a-b));
			break;
			
		case 3: System.out.println("multiplication="+(a*b));
			break;
			
		case 4:System.out.println("division="+(a/b));
			break;
		
		case 5:System.out.println("modulas="+(a%b));
			break;
		case 6:System.out.println("exit from the application");
			go =false;
			break;
			
		default:
			System.out.println("you enter wrong choice!!");
			
		}
		
	}
		
	catch(Exception  e)
		{
		System.out.println(e.toString());
		}
		}
	

}
}