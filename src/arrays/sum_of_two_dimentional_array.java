package arrays;

import java.util.Scanner;

public class sum_of_two_dimentional_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the no of rows");
		int r=sc.nextInt();
		
		System.out.println("enter the no of columns");
		int c=sc.nextInt();
		
		
		
		int a[][] = new int[r][c];
		
		System.out.println("enter the elements of an array");
		
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			
			System.out.println();
		}
		
    int b[][] = new int[r][c];
		
		System.out.println("enter the elements of an array");
	
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			
			System.out.println();
		}
		
		int d[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
		
		for(j=0;j<c;j++)
		{
				d[i][j]=a[i][j]+b[i][j];
			}
		
	System.out.println("addition:");
			
			
			
			
			
			for(i=0;i<r;i++)
			{
			
				for(j=0;j<c;j++)
				{
					System.out.print("\t"+d[i][j]);
				}
				System.out.println();
				
			
		
		
		
		
		

	}

		}}}
