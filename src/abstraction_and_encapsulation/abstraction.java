package abstraction_and_encapsulation;


abstract class vehicle // abstract class 
{
abstract void start();//  abstract method
	}

class car extends vehicle 
{

	@Override
	void start() {
	System.out.println("car starts with keys ");
	}
	
}

 class scooter extends vehicle 
{

	@Override
	void start() {
		System.out.println("scooter starts using kick");
		
	}
	
}

 class bus extends vehicle
 {

	@Override
	void start() {
		System.out.println("hello");
		
	}
	 
 }

public class abstraction {

	public static void main(String[] args) {
		

		car obj = new car();
		obj.start();
		scooter obj2= new scooter();
		obj2.start();
		bus obj3= new bus();
		obj3.start();
		

	}

}
