package conditional_statements;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("enter c");
		c=sc.nextInt();
		if (a>b && b>c)
		{
			System.out.println(" a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greter");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
