package collectionframework_list;

import java.util.ArrayList;

class Employee
{
	int eid;
	String ename;
	int esalary;
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
}

public class objectArrayList {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"monesh",10000);
		Employee e2=new Employee(2,"harsha",20000);
		Employee e3=new Employee(3,"juk",1000);
		ArrayList<Employee> l1=new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		for(Employee i:l1)
		{
		
		System.out.print(i.eid+" ");
		System.out.print(i.ename+" ");
		System.out.print(i.esalary+"");
		System.out.println();
		}
		


	}

}
