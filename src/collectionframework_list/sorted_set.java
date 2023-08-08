package collectionframework_list;

import java.util.TreeSet;

public class sorted_set {

	private static final String SortedSet  = null;

	public static void main(String[] args) {
		java.util.SortedSet s1=new TreeSet();
		s1.add("apple");
	    s1.add("oranges");
	    s1.add("papaya");
	    s1.add("banana");
	    for(Object i:s1)
	    {
	    	System.out.println(i);
	    }
	    System.out.println("first element :"+s1.first());
	    System.out.println("last element :"+s1.last());
	    System.out.println("head set elements : "+s1.headSet("banana"));

		System.out.println("tail set elements : "+s1.tailSet("banana"));
		
		s1.remove("apple");
		
		System.out.println(s1);
		
		System.out.println("contains: "+s1.contains("Banana"));
	    
    
	}

}
