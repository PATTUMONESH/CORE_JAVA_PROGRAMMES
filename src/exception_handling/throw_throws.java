package exception_handling;

class RadiusExpection extends Exception
{
	public String tostring()
	{
		return "radius cannot be negative";
	}
	public String getMessage()
	{
		return "radius should be positive";
	}
}

public class throw_throws {
//	public static double area(int r)
	public static double area(int r)throws Exception
	{
		if(r<0)
		{
		throw new RadiusExpection();
		}
		else
		{
			double result =Math.PI*r*r;
			return result;
		}
//		double result =Math.PI*r*r;
//		return result;
		
		
	}
	
	
	
	
//	public static int divide(int a,int b)
//	{
//		int result =a/b;
//		return result;
//	}
//	

	public static void main(String[] args) {
		try
		{
			
		double ar =area(-2);
		System.out.println(ar);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		
		
//		try
//		{
//			int c=divide(20,0);
//		      System.out.println(c);
//}
//		catch(Exception e)
//		{
//			System.out.println("there is exception");	
//		}
		
	}

}
