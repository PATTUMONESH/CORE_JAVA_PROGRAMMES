package inheritance;
class A
{
	public void work()
	{
		System.out.println("hi i am working");
	}
}


class B extends A
{
	public void play()
	{
		System.out.println("hii i am playing");
	}
}

class C extends B
{
	public void eat()
	{
		System.out.println("hii i am eating ");
	}
}

public class inherit {

	public static void main(String[] args) {
		
		
		A obj= new A();
		obj.work();
	
		
		
	
		B obj2 = new B();
		obj2.play();
		obj2.work();
		
		
		C obj3 = new C();
		
		obj3.work();
  	    obj3.play();
  	    obj3.eat();
		

	}

}

