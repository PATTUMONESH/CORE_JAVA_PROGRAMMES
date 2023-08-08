package constructor;
class A
{
	int a;
	int b;
	public A() {
		super();
		System.out.println("hi");
	}
	

public A(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
 


@Override
public String toString() {
	return "A [a=" + a + ", b=" + b + "]";
}



public class con3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(10,20);
		System.out.println(obj.toString());
		

	}

}}
