package this_keyword;

class This1
{
	int i;
	public void method(int i)
	{
		this.i=i;
		
	}
	
	public void display()
	{
		System.out.println("value of i="+i);
	}
}
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This1 obj= new This1();
		obj.method(10);
		obj.display();
		
		
	}

}
