package collectionframework_list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashset1 {

public static void main(String args[])
	
	{

	Integer[] A = {2,4,17,19};
	Integer[] B = {12,14,17,19};
	
	Set<Integer> s1 = new HashSet<Integer>();
	
	s1.addAll(Arrays.asList(A));
	
	Set<Integer> s2 = new HashSet<Integer>();
	s2.addAll(Arrays.asList(B));
	
	
	Set<Integer> unionset = new HashSet<Integer>(s1);
	
	unionset.addAll(s2);
	
	System.out.println("union ="+unionset);
	
	Set<Integer> intersectionset = new HashSet<Integer>(s1);
	
	intersectionset.retainAll(s2);
	System.out.println("intersection ="+intersectionset);
	
	Set<Integer> differenceset = new HashSet<Integer>(s2);
	
	differenceset.removeAll(s1);
	
	System.out.println("difference="+differenceset);
	
	}
	}


