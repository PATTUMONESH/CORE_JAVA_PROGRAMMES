package array_programing_questions;

import java.util.Scanner;

public class delect_specific_element_in_array {

	public static void main(String[] args) {
		 int i, n,del;
	        int position = 0;
	        int flag=0;
			
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
			
			
			System.out.println("enter the element which you want to delete...!!");
			del=sc.nextInt();
			
			
			for(i=0;i<n;i++)
			{
				if(a[i]==del) // a[2] == 6 // 6 == 6
				{
					position =i;
					flag=1;
				}
			}
			
			if(flag ==1)
			{
				
				for(i=0;i<n-1;i++)
				{
					if(i< position)
					{
						t[i]= a[i];
					}
					
					if(i>=position)
					{
						t[i]=a[i+1];  // t[2] = a[2+1]
					}
				}
				
				System.out.println("Array after deletion:");
				
				for(i=0;i<n-1;i++)
				{
					System.out.println(t[i]);
				}
			}
			
			else
			{
				System.out.println("element is not present in the array");
			}
			
	

	}

}

