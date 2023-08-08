package collectionframework_list;

import java.util.HashSet;
import java.util.Iterator;

public class set1 {

	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String>();
		
		s1.add("ram");
		s1.add("uamsh");
		s1.add("syam");
		System.out.println(s1);
		Iterator itr=s1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		for(String i:s1)
        {
        	System.out.println(i);
        }
		
	}

}
