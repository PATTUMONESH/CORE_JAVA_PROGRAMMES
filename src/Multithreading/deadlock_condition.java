package Multithreading;

import collectionframework_list.static_;

class dead1
{
	public void run()
	{
		synchronized (deadlock_condition.ob1) {
			
			synchronized (deadlock_condition.ob2) {
			
		}
	}
}
}
	class dead2
	{
		public void run()
		{
			synchronized (deadlock_condition.ob2) {
				
				synchronized (deadlock_condition.ob1) {
				
			}
		}
	}
	}

public class deadlock_condition {
	public static Object ob1=new Object();
	public static Object ob2=new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}


