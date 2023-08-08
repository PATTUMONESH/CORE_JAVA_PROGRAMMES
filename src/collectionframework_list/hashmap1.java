package collectionframework_list;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
Map<Integer, String> m1=new HashMap<Integer, String>();
		
//		m1.put(1, "mony");
//		m1.put(3, "amit");
//		m1.put(2, "madam");
//		m1.put(5, "sakshi");
//		
//		for(Map.Entry m:m1.entrySet())
//		{
//			System.out.println(m.getKey()+"   "+m.getValue());
//		}
m1.put(1001, "sakshi");
m1.put(1002, "Arjun");
m1.put(1003, "rahul");


//m1.remove(1001);
//
//System.out.println(m1);

// m1.remove(1001,"sakshi"); //key -value

System.out.println(m1);

 
 m1.replace(1002,"sneha");
 
 m1.replace(1003,"rahul","Ram");

System.out.println(m1);



m1.replaceAll((k,v)->"Arjun");

System.out.println(m1);	

for(Map.Entry m:m1.entrySet())
{
	System.out.println(m.getKey()+"    "+m.getValue());
}

	}

}
