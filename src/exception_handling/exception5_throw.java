package exception_handling;

public class exception5_throw {
	static void age(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("access denied below 18 ");
		}
		else
		{
			System.out.println("access granted");
		}
	}

	public static void main(String[] args) {
		age(17);

	}

}
