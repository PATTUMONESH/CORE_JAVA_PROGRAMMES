package loose_coupling;


public class Manager {

	Iworker iw;

	public Manager(Iworker iw) {
		super();
		this.iw = iw;
	}
	
	public void managerwork()
	{
		iw.work(); 
	}
	
}
