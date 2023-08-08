package collectionframework_list;

import java.util.SortedMap;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
	  SortedMap<Integer, String> m1=new TreeMap<Integer, String>();
	  m1.put(1, "a");
	  m1.put(9, "a1");
	  m1.put(4, "a2");
	  m1.put(8, "a3");
	  m1.remove(4);
	  System.out.println(m1);
	  System.out.println("decending map:"+((TreeMap<Integer, String>) m1).descendingMap());
	}

}
