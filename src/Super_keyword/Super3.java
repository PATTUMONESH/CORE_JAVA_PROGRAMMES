package Super_keyword;

class fruit1
{
	fruit1()
	{
		System.out.println("hii i am fruit1 class constructor");
	}
}

class fruit2 extends fruit1 
{
	fruit2()
	{
		super();
		System.out.println("hii i am fruit2 class constructor");
	}
}
public class Super3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fruit2 obj=new fruit2();
	}

}

