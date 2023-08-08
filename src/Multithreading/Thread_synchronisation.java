package Multithreading;
 class Bookurshow
 {
	 int total_seats=10;
	 public void bookseat(int seats)
	 {
		 //System.out.println("hi........." +Thread.currentThread().getName());
		 synchronized (this) {
			 System.out.println("hi........." +Thread.currentThread().getName());
			 if(total_seats>=seats)
			 {
				 System.out.println("seats booked successfully");
				total_seats=total_seats-seats;
				System.out.println("available seats are:" +total_seats);
		 		 
			 }
			 else
			 {
				 System.out.println("seats cannot be booked");
				 System.out.println("left seats are:" +total_seats);
				 		
			 }
			
		}
		System.out.println("bye........." +Thread.currentThread().getName());
	 }
 }

public class Thread_synchronisation extends Thread
{
	
	static Bookurshow b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}





	public static void main(String[] args) {
	
		b=new Bookurshow();
		
		Thread_synchronisation monesh =new Thread_synchronisation();
		monesh.seats =7;
		monesh.setName("monesh thread");
		monesh.start();
		Thread_synchronisation monesh1 =new Thread_synchronisation();
		monesh1.seats =7;
		monesh1.setName("monesh1 thread");
		monesh1.start();

	}

}
