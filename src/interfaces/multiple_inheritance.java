package interfaces;
interface a
{
	void m1();
}
interface b
{
	void m2();
}
class c implements a,b
{

	@Override
	public void m2() {
		System.out.println("method 2");
		
	}

	@Override
	public void m1() {
		System.out.println("method 1");
		
	}
	
}

public class multiple_inheritance {

	public static void main(String[] args) {
	
		c obj=new c();
		obj.m1();
		obj.m2();

	}

}
