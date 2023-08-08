package Super_keyword;

class key1
{
	int a=10;
}
class key2 extends key1
{
	int a=20;
	
	public void show(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key2 obj=new key2();
		obj.show(30);

	}

}
