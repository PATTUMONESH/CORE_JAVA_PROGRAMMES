package STRINGS;

public class String_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer S= new StringBuffer("hyderabad");
		System.out.println(S);
		
//		S=S.append("bangalore");
//		System.out.println(S);
//		
//		S=S.insert(9, " delhi ");
//		System.out.println(S);
		
//		S=S.delete(0, 3);
//		System.out.println(S);
		
//		S=S.delete(2,3);
//		System.out.println(S);
//		
//		
//		S=S.deleteCharAt(5);
//		System.out.println(S);
//		
		S=S.replace(0, 5, "helloabc");
		System.out.println(S);

	}

}
