package Multithreading;

class RunnableThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing the runnable interface, thread started running.....!!!");
	}
	
}



public class prog1 {

	public static void main(String[] args) {
		
		RunnableThread t1 = new RunnableThread();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
		
		

	}

}