package collectionframework_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		
		m1.put(1, "mony");
		m1.put(3, "amit");
		m1.put(2, "madam");
		m1.put(5, "sakshi");
		Set s1=m1.entrySet();   //converting to set
		Iterator itr =s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next(); //converting to map,to get key and value seperately
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}

	}

}
