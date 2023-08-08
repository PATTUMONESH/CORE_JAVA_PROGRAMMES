package lambra_expression;

import java.util.Arrays;
import java.util.List;

public class prog1 {

	public static void main(String[] args) {
		List<Integer> values =Arrays.asList(1,2,3,4,5);
//		for(int i=0;i<values.size();i++)
//		{
//			System.out.println(values.get(i));
//		}
//		for(int i:values)
//		{
//			System.out.println(i);
//		}
       
		values.forEach(i -> System.out.println(i));
	}

}
