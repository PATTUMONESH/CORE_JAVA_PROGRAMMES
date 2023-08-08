package collectionframework_list;

import java.util.LinkedHashSet;
import java.util.Set;
class coarses
{
	int id;
	String name;
	String fees;
	public coarses(int id, String name, String fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
}

public class linkedhashset {

	public static void main(String[] args) {
//	 Set<String> s1=new LinkedHashSet<String>();
//	 
//	 s1.add("c");
//	 s1.add("c++");
//	 s1.add("java");
//	 s1.add("python");
//	 System.out.println(s1);
//	 System.out.println(s1.remove("c"));
//	 System.out.println(s1);
		
		Set<coarses> s1=new LinkedHashSet<coarses>();
		 coarses c1=new coarses(101,"c","10000");
		 coarses c2=new coarses(102,"c++","10500");
		 coarses c3=new coarses(103,"python","10020");
		 
		 s1.add(c1);
		 s1.add(c2);
		 s1.add(c3);
		 
		 for(coarses c:s1)
		 {
			 System.out.println(c.id+" "+c.name+" "+c.fees);
		 }
	 
	 
	}

}
