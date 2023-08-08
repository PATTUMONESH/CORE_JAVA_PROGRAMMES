package conditional_statements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		int ch;
		System.out.println("enter your choice between[1 to 5]");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("sum ="+(a+b));
			break;
		case 2:System.out.println("subtraction ="+(a-b));

			break;
		case 3:System.out.println("multiplication ="+(a*b));

			break;
		case 4:System.out.println("division ="+(a/b));

			break;
		case 5:System.out.println("module ="+(a%b));

			break;
			default:
				System.out.println("entered wrong");
			
			
			
		}
		
      

	}

}
