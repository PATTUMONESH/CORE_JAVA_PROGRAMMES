package special_programes;

import java.util.Scanner;

public class reverse_of_no {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();

		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		System.out.println("reverse of no:"+sum);
		

	}

}
