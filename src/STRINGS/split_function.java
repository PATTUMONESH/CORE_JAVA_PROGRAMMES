package STRINGS;

public class split_function {

	public static void main(String[] args) {
String s="ja@va fu@ll sta@ck devel@oper";
		
		//System.out.println(s.split(" "));
	
		String s1[]=s.split("@");
//		System.out.println(s1[0]);
//		System.out.println(s1[1]);
		
		
		
		System.out.println("by using for each");
		for(String j : s1 )
		{
			System.out.println(j);
		}
		
		
		System.out.println("\nby using for loop");
		int i;
		for(i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}

}
