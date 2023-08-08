package collectionframework_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		//List<String> l1=new ArrayList<String>();
        ArrayList<String> l1=new ArrayList<String>();
        
        l1.add("monesh");
        l1.add("arjun");
        l1.add("nuh");
        l1.add("lad");
        l1.add("binny");
        
       // System.out.println(l1);
        
        //Traversing using iterator
//        Iterator itr=l1.iterator();
//        
//        while(itr.hasNext())
//        {
//        	System.out.println(itr.next());
//        }
        //l1.set(0, "ram");   //replace any element
        Collections.sort(l1);
        
    for(String i:l1)
        {
        	System.out.println(i);
        }
        
	}

}
