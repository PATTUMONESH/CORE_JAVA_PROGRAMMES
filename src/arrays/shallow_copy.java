package arrays;

public class shallow_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][] = {{1,2,3,4},{2,7,8,9}};
		
		
		int c[][] = a.clone();
		
		System.out.println("before chnaging");
		System.out.println();
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		a[0][0]=9;
		
		System.out.println();
		System.out.println("after changing");
		System.out.println();
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		//System.out.println(a==c);

	}



	}


