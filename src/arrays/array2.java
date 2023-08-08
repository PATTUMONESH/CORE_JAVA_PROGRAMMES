package arrays;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no of elements: ");
		int n=sc.nextInt();
		
		int i;

		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the first arrayy elements: ");
		for(i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();	
		}
		System.out.println("enter the second arrayy elements: ");
		for(i=0;i<n;i++)
		{
		   b[i]=sc.nextInt();	
		}
		int c[]=new int[n];
		for(i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println("sum array is: ");
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);	
		}
		
		
	
		
		
		
			

	}

}
