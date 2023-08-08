package loose_coupling;
public class test {

	public static void main(String[] args) {
		lazyworker lw= new lazyworker();
		Manager m= new Manager(lw);
		m.managerwork();
		
		
		Smartworker sw= new Smartworker();
		m= new Manager(sw);
		m.managerwork();
		
		extrasmartWorker  ex = new extrasmartWorker();
		m= new Manager(ex);
		m.managerwork();
		
	}

}
