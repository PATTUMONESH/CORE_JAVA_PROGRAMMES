package Tightcoupling;

public class manager {
	lazyworker lw;
	Smartworker sw;
	extraSmartWorker ex;
	
	
	

	public manager(lazyworker lw, Smartworker sw, extraSmartWorker ex) {
		super();
		this.lw = lw;
		this.sw = sw;
		this.ex = ex;
	}




	public void work()
	{
		System.out.println("manager is working");
		lw.work();
		sw.work();
		
		ex.work();
		
	}
}


