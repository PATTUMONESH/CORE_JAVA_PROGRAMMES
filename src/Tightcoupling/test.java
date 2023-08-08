package Tightcoupling;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lazyworker lw= new lazyworker();
		Smartworker sw= new Smartworker();
		extraSmartWorker ex = new extraSmartWorker();
	
		manager m= new manager(lw, sw,ex);
		m.work();
		
	}

}



