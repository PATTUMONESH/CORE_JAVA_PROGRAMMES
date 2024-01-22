package array_programing_questions;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {4,5,6,7,8};
		int c[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=0;i<5;i++)
		{
			System.out.println(c[i]+"\t");
		}
		
	}

}
