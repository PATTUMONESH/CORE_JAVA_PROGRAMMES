package collectionframework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		//List<String> l1=new ArrayList<String>();
        LinkedList<String> l1=new LinkedList<String>();
        
        
        l1.add("monesh");
        l1.add("mone");
        l1.add("mony");
        
       // System.out.println(l1);
        
        //Traversing using iterator
//        Iterator itr=l1.iterator();
//        
//        while(itr.hasNext())
//        {
//        	System.out.println(itr.next());
//        }
        for(String i:l1)
        {
        	System.out.println(i);
        }
        
	}

}
