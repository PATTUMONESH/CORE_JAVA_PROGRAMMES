package polymorphism;

class M
{
	public void home()
	{
		System.out.println("hello");
	}
	
	public void home(int a)
	{
		System.out.println("a="+a);
	}
	
	public void home(double a)
	{
		System.out.println("a="+a);
	}
	
	public void home(int a, double b)
	{
		System.out.println("a="+a+"    b="+b);
	}
	
	public void home( double b,int a)
	{
		System.out.println("a="+a+"    b="+b);
	}
}

public class method_overloading {

	public static void main(String[] args) {
		
		
		M obj= new M();
		obj.home();
		obj.home(10);
		obj.home(2.35);
		obj.home(2.5, 12);
		obj.home(5, 0.4);

	}

}
