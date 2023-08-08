package class_and_object_program;

class ABC
{
	public void sum()  //NANR
	{
		System.out.println("sum="+(10+5));
	}
	
	public int sub() //NAWR
	{
		int a=10;
		int b=5;
		int c;
		c=a-b;
		return c;
	}
	
	public void mul(int a, int b)   //wanr
	{
		
		System.out.println("multiplication="+(a*b));
	}
	
	public int division(int a, int b)     //wawr
	{
		return (a/b);
	}
}

public class class1 {
	

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.sum();
		System.out.println("subtraction="+obj.sub());
		obj.mul(10,20);
		System.out.println("division ="+obj.division(200,100));

	}

}