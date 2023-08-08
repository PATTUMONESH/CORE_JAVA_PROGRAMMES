package lambra_expression;


interface A
{
	public void show(int i);
}

//class xyz implements A
//{
//
//	@Override
//	public void show() {
//		System.out.println("hello");
//		
//	}
//	
//}

public class prog2 {

	public static void main(String[] args) {
		
		A obj;    //reference of interface
		
		obj=i-> System.out.println("hello"+i);
		
		obj.show(6);
		

	}

}
