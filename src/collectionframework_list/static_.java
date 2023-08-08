package collectionframework_list;
import java.util.Stack;


public class static_ {

	public static void main(String[] args) {
		
		Stack<String> l1 = new Stack<String>();
		
		l1.push("Swati");
		l1.push("karan");
		l1.push("sneha");
		
		
	//	System.out.println(l1);
		
		
		//Traversing using Iterator
//		Iterator itr = l1.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Traversiong through for each loop
		
		for(String i:l1)
		{
			System.out.println(i);
		}
		

	}
	}

