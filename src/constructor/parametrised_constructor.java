package constructor;
class constructor2
{
	constructor2(String name,int age)
	{    this(58);
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	constructor2(int c)
	{
		System.out.println("c="+c);
	
	}
}

public class parametrised_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor2 obj=new constructor2("monesh",50);
		//constructor2 obj2=new constructor2(90);
		


	}

}
