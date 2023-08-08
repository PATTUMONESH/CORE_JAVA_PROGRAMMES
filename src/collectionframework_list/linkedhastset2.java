package collectionframework_list;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhastset2 {

	public static void main(String[] args) {
	  Set<Integer> s1=new LinkedHashSet<Integer>();
	  s1.add(21);
	  s1.add(22);
	  s1.add(25);
	  System.out.println(s1);
	  Set<Integer> s2=new LinkedHashSet<Integer>();
	  
	  s2.add(29);
	  s2.add(28);
	  s2.addAll(s1);
	  System.out.println(s2);
//	  s2.clear();
//	  System.out.println(s2);
	  System.out.println(s2.contains(28));
	  System.out.println();
	  System.out.println(s1.containsAll(s2));
	  System.out.println(s1.containsAll(s1));
	  System.out.println(s2);
	  System.out.println(s2.hashCode());
	  System.out.println(s2.isEmpty());
	  
	  s2.remove(25);
	  System.out.println(s2);
	  
//	  s2.removeAll(s1);
//	  System.out.println(s2);
	  
	  s2.retainAll(s1);
	  System.out.println(s2);
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
