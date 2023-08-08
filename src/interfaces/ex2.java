package interfaces;
interface inter
{
	static void hello()
	{
		System.out.println("hello world");
	}
	default void show()
	{
		System.out.println("this is default method of interface");
		display();
	}
	private void display()
	{
		System.out.println("this is private method of interfaces");
	}
}

public class ex2 implements inter{

	public static void main(String[] args) {
		inter.hello();
		ex2 obj=new ex2();
		obj.show();
		
		

	}

}
