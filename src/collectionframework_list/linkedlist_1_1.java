package collectionframework_list;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist_1_1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("swati");
		l1.add("ram");
		l1.add("rohan");
		System.out.println(l1);
		l1.remove("rohan");
		System.out.println(l1);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("swati");
		l2.add("ram2");
		l2.add("rohan2");
		
		l1.addAll(l2);
		System.out.println(l1);
//		l1.removeAll(l2);
//		System.out.println(l1);

//		l1.removeFirst();
//		System.out.println(l1);
//		l1.removeLast();
//		System.out.println(l1);
//		
//		l1.removeFirstOccurrence("swati");	
//      System.out.println(l1);

		l1.removeLastOccurrence("swati");	
    System.out.println(l1);
//       for(int i=l1.size()-1;i>=0;i++)
//       {
//         System.out.println(l1[i);
//       }
    Iterator i=l1.descendingIterator();
    while(i.hasNext())
    {

		
      System.out.println(i.next());
    }
    
      
      
   
	}

}
