package exception_handling;

public class throw2 {
	static void demo()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e)
		{
			System.out.println("catch inside demo");
			throw e;     //rethrow exception
		}
	}

	public static void main(String[] args) {
		try
		{
			demo();
		}
		catch (NullPointerException e)
		{
			System.out.println("recautch" +e);
		
		}
		//demo();

	}

}
