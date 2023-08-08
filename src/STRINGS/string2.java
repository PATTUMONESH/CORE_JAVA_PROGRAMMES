package STRINGS;

import java.util.Scanner;

public class string2 {
	public static void main(String[] args) {
		int S_id;
		String fname;
		String lname;
		String city;
		String phno;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the student Id");
		S_id=sc.nextInt();
		
		System.out.println("enter the student first name");
		fname= sc.next();
		
		System.out.println("enter the student last name");
		lname= sc.next();
		
		System.out.println("enter the student city");
		city= sc.next();
		
		System.out.println("enter the student phone no");
		phno= sc.next();
		
		
		
	
		System.out.println("Id="+S_id);
		System.out.println("first name="+fname);
		System.out.println("last name="+lname);
		System.out.println("city="+city);
		System.out.println("phone no="+phno);

		
	}

}
