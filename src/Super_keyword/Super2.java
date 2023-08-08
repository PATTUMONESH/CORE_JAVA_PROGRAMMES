package Super_keyword;

class Sup1
{
	public void m1()
	{
		System.out.println("hii i am m1 from class A");
	}
}

class Sup2 extends Sup1
{
	
	public void m1()
	{
		System.out.println("hii i am m1 from class B");
	}
	public void show()
	{
		
		super.m1();
		this.m1();
		System.out.println("hii i am display method");
	}
	
}

public class Super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sup2 obj= new Sup2();
		obj.show();
	}

}