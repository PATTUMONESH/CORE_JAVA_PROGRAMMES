package STRINGS;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		 String name;
		 int Id;
		 String city;
		 String pno;
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter your name");
		name=in.next();
		
		System.out.println("enter the id");
		Id=in.nextInt();
		
		System.out.println("enter the city");
		city=in.next();
		
		System.out.println("enter your phno");
		pno=in.next();
		
		System.out.println("name="+name+"id="+Id+"city="+city+"pno="+pno);
		

	}

}
