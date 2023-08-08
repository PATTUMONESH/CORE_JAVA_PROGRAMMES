package arrays;

import java.util.Scanner;

public class two_dimensional {

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
		
		
		

	}

}
