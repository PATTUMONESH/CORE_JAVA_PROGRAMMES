package array_programing_questions;

import java.util.Scanner;

public class insert_element_in_array {

	public static void main(String[] args) {
		 int n,i,insitem,position=0;
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter the total no of elements...");
			n= sc.nextInt();
			
			
			int a[] = new int[n];
			int t[] = new int[n+1];
			
			System.out.println("enter the elements of an array");
			for(i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
			
			
			System.out.println("enter the element which you want to insert");
			insitem= sc.nextInt();
			
			
			System.out.println("enter the position where you want to insert element");
			position =sc.nextInt();

			
			position =position-1;
			
			for(i=0;i<=n;i++)
			{
				if(i<position)
				{
					t[i]= a[i];
				}
				
				
				if(i>position)
				{
					t[i]=a[i-1];
				}
				
				if(i== position)
				{
					t[i]=insitem;
				}
			}
			
			
			System.out.println("after insertion array is:");
			
			for(i=0;i<=n;i++)
			{
				System.out.println(t[i]);
			}
			

	}

}
