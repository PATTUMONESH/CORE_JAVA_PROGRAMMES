package STRINGS;

public class trip_strip {

	public static void main(String[] args) {
String s="    ExcelR     ";
		
		System.out.println(s);
		
		System.out.println(s.trim());
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
//		
		System.out.println(s.repeat(4));

	}

}
