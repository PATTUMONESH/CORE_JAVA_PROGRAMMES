package collectionframework_list;

import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(11);
		l2.add(13);
		System.out.println(l2);
		
		//l1.addAll(l2);
		//System.out.println(l1);
		l1.addAll(1, l2);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		l1.remove(Integer.valueOf(103));
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		
		
		
		
		
	
		
		

	}

}
