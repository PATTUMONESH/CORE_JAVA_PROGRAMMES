package Multithreading;

class ExtendingThread extends Thread
{
	public void run()
	{
		System.out.println("extending thread class, thread started running....!!!!");
	}
}


public class prog2 {

	public static void main(String[] args) {
		
		ExtendingThread t1 = new ExtendingThread();
		t1.start();
		

	}

}