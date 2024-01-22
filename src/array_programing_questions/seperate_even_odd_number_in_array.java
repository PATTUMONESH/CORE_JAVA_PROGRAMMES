package array_programing_questions;

import java.util.Scanner;

public class seperate_even_odd_number_in_array {

	public static void main(String[] args) {
int i, n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the total no of elements...");
		n= sc.nextInt();
		
		
		int a[] = new int[n];
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("even numbers are: ");
		
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		
        System.out.println("odd numbers are: ");
		
		for(i=0;i<n;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}

	}

}
