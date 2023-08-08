package collectionframework_list;

import java.util.HashMap;
import java.util.Map;

class student
{
	int id;
	String name;
	String city;
	
	public student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
}

public class hashmap2 {

	public static void main(String[] args) {
		
		Map<Integer, student> m1 = new HashMap<Integer, student>();
		
		
		student s1 = new student(101,"Binayak","delhi");
		student s2 = new student(102,"pawan","hyd");
		student s3 = new student(103,"monesh","chennai");
		
		
		
		m1.put(1, s1);
		m1.put(2, s2);
		m1.put(3, s3);
		
		
	for(Map.Entry<Integer, student> i:m1.entrySet())
	{
		int k=i.getKey();
		
		student s = i.getValue();
		
		System.out.println(k+"        "+s.id+" "+s.name+" "+s.city);
		
	}
		
		
		


	
	}

}
