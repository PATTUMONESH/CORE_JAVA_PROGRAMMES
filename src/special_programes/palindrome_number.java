package special_programes;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		int n;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		int sum=0;
		int r;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		System.out.println("reverse of no:"+sum);
		if(sum==t)
		{
			System.out.println("no is palindrome:"+sum);	
		}
		else
		{
			System.out.println("no is not palindrome:"+sum);
		}
		

	}

}
