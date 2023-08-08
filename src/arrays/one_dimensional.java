package arrays;

import java.util.Scanner;

public class one_dimensional {

	public static void main(String[] args) {

			int a[]= {2,3,4,5,6,7};
			int i;
			
			
			
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
			}
			
			//_________________________________________________________________//
			
			int n;
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter total number of elements ");
			n= sc.nextInt();
			
			
			
			int b[] = new int[n];
			
			System.out.println("enter the elements of an array..!!");
			for(i=0;i<n;i++)
			{
				b[i] = sc.nextInt();
			}
			
			System.out.println("array elements are:");
			
			for(i=0;i<n;i++)
			{
				System.out.println(b[i]);
			}
			
			
			
			
			
			
			
			
			
			

		}

	
		

	}


