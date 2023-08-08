package interfaces;

interface abc
{
	void start();
}
class car implements abc{

	@Override
	public void start() {
		System.out.println("hello world");
		
	}
	
}



public class ex1 {

	public static void main(String[] args) {
		car obj=new car();
		obj.start();

	}
	
}
