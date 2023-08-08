package STRINGS;

public class string {

	public static void main(String[] args) {
String s1="String program";//string literal
		
		String s2=new String("String program 2"); // new keyword
	
		char ch[]= {'s','t','r','i','n','g'};
		String s3= new String(ch); //new keyword
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4="sakshi"+5+5;//sakshi55
		System.out.println(s4);
		
		String s5="sakshi"+'5'+'5';  // sakshi55
		System.out.println(s5);  
		
		String s6="sakshi"+(5+5);// "sakshi"+10= sakshi10
		System.out.println(s6); 
		
		String s7="excelR ";
		String s8=" learning";
		 String s9 = s7+s8;
		//String s9=s7.concat(s8);
		System.out.println(s9);
		
		s9.length();
		
	}

}