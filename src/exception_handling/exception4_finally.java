package exception_handling;

public class exception4_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
    	   int a=100,b=2,c;
    	   c=a/0;
    	   System.out.println(c);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println(e);
       }
       finally
       {
    	   System.out.println("i am in finally block");
       }
       System.out.println("hello world");
	}

}
