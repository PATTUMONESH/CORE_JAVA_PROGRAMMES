package array_programing_questions;


import java.util.Scanner;

public class sum_of_positive_negative_integers_in_array {

	public static void main(String[] args) {
		int n,i;
		int pos=0;
		int neg=0;
    Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the total no of elements...");
		n= sc.nextInt();
		
		
		int a[] = new int[n];
		int t[] = new int[n-1];
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		
		
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				pos=pos+a[i];
			}
			if(a[i]<0)
			{
				neg=neg+a[i];
			}
		}
		
		
		System.out.println("sum of positive integers is: "+pos);
		System.out.println("sum of negative numbers is: "+neg);
		
		
		
		
		

	}

}

