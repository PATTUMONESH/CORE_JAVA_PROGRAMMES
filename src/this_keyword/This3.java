package this_keyword;

class Con5
{
	Con5()
	{
		
		
		System.out.println("hii i am default constructor");
	}
	
	Con5(int a)
	{
	
		this();
		System.out.println("value of a="+a);
	}
	Con5(int a, int b)
	{
	
		this(10);
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class This3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Con5 obj=new Con5();
//		Con5 obj2= new Con5(10);
		Con5 obj3= new Con5(20,10);
		
	}

}