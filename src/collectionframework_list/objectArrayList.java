package collectionframework_list;

import java.util.ArrayList;

class Employees
{
	int eid;
	String ename;
	int esalary;
	public Employees(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
}

public class objectArrayList {

	public static void main(String[] args) {
		
		Employees e1=new Employees(1,"monesh",10000);
		Employees e2=new Employees(2,"harsha",20000);
		Employees e3=new Employees(3,"juk",1000);
		ArrayList<Employees> l1=new ArrayList<Employees>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		for(Employees i:l1)
		{
		
		System.out.print(i.eid+" ");
		System.out.print(i.ename+" ");
		System.out.print(i.esalary+"");
		System.out.println();
		}
		


	}

}
