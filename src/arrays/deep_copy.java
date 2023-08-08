package arrays;

public class deep_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,1,2,3,4,5};
		
		int c[] = a.clone();
		System.out.println("before changing");
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.println();
		
		
		a[1]=5;
		
		System.out.println("after changing");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		
		
		
	//System.out.println(a[0] == c[0]);


	}

}
