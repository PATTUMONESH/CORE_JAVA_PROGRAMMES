package this_keyword;

class method2
{
	public void display()
	{
		System.out.println("hii i am display method");
	}
	
	public void show()
	{
	    this.display();
	}
}

public class this2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method2 obj=new method2();
		obj.show();
	}

}

