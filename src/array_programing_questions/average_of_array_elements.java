package array_programing_questions;

public class average_of_array_elements {

	public static void main(String[] args) {
		int a[]= {90,80,88,45,87};
		int i,sum=0,avg=0;
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements:" +sum);
		
		avg=sum/5;
		System.out.println("avg of elements:" +avg);
		
		
		

	}

}
