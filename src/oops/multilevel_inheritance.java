package oops;

class A
{
	public void jm()
	{
		System.out.println("hi i am parent class method");
	}
}
class B extends A 
{
	public void km()
	{
		System.out.println("hi i am child class method 1");
	}
}
class C extends B 
{
	public void lm()
	{
		System.out.println("hi i am child class method ");
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
	A obj =new A();
	obj.jm();
	B obj1=new B();
	obj1.km();
	obj1.jm();
	C obj2=new C();
	obj2.km();
	obj2.jm();
	obj2.lm();
	
		

	}

}
