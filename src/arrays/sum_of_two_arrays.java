package arrays;


import java.util.Scanner;

public class sum_of_two_arrays {
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the elements of first array:");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	
		System.out.println("enter total no of elements:");
		n=sc.nextInt();
		int b[]=new int[n];
		
		System.out.println("enter the elements of second array:");
		
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	
		int c[]=new int[n];
		for(i=0;i<n;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println("additon:");
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
		int d[]=new int[n];
		for(i=0;i<n;i++) {
			d[i]=a[i];
			a[i]=b[i];
			b[i]=d[i];
		}
		System.out.println("first array is :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("second array is :");
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
	
	
	
	
	
	}
}
