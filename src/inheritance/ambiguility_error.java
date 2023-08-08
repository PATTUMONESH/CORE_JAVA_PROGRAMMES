package inheritance;

class s1
{
	public void pm()
	{
		System.out.println("hello ");
	}
}

class s2
{
	public void am()
	{
		System.out.println("work 2");
	}
}

class s3 extends s1//,s2
{
	
}

public class ambiguility_error {

	public static void main(String[] args) {
		s3 obj = new s3();
		obj.pm();

	}

}
