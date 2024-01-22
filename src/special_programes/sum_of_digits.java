package special_programes;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		int n=123,r,sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
			//sum=sum+r*r;
			//sum=sum+r*r*r;
		}
		System.out.println("sum of digits:"+sum);

	}

}
