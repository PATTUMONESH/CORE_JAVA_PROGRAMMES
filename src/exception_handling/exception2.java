package exception_handling;

public class exception2 {

	public static void main(String[] args) {
		
//		int n=10;
//		int c;
//		c=n/0;
//		
//		System.out.println(c);
		
		try
		{
			int n=100, c;
			c=n/0;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
		     e.printStackTrace();
			System.out.println(e);
			
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
		
		
		

	}

}