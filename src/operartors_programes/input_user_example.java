package operartors_programes;

import java.util.Scanner;

public class input_user_example {

	public static void main(String[] args) {
		String name;
		int age;
		double marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		name =sc.next();
		System.out.println("enter the age:");
		age =sc.nextInt();
		System.out.println("enter the marks:");
		marks =sc.nextDouble();
		System.out.println(" name="+name+" age="+age+" marks="+marks);
		
		
		

	}

}
