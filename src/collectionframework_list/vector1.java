package collectionframework_list;

import java.util.Enumeration;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("a");
		v1.add("b");
		v1.add("c");
		System.out.println(v1);
		System.out.println(v1.capacity());    //default size
		System.out.println(v1.size());
		v1.addElement("d");
		v1.addElement("e");
//		System.out.println(v1);
//		System.out.println(v1.capacity());    //default size
//		System.out.println(v1.size());
//		if(v1.contains("d"))
//		{
//			System.out.println(v1.indexOf("d"));
//		}
//		System.out.println(v1.firstElement());
//		System.out.println(v1.lastElement());
//		
//		System.out.println(v1.remove(4));
//		System.out.println(v1);
//		
//		v1.removeElementAt(1);
//		System.out.println(v1);
//		
		
		Enumeration<String> enu =v1.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
	}

}
