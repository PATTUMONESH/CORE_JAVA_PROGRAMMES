package arrays;

import java.util.Scanner;

public class remove_repeated_element {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the total no of elements...");
		n= sc.nextInt();
		
		
		int a[] = new int[n];
		
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		int t[] = new int[n];
		int j=0;
		
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				t[j++] = a[i];
			}
		}
		
		t[j++]=a[n-1];
		
		
		for(i=0;i<j;i++)
		{
			System.out.println(t[i]);
		}
	}

}
