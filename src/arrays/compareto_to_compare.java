package arrays;

public class compareto_to_compare {

	public static void main(String[] args) {
		//compareTo()        compareToIgnoreCase()
				String s1="dinesh";
				String s2="dinesh";
				String s3="Dinesh";
				String s4="ratan";
				//equals method
//				System.out.println(s1.equals(s2));// true
//				System.out.println(s1.equals(s3)); // false
				
				//equalsignorecase
//				System.out.println(s1.equalsIgnoreCase(s2));// true
//				System.out.println(s1.equalsIgnoreCase(s3)); //true
//				
				//using equaloperator
//				System.out.println(s1==s2);//true
//				System.out.println(s1==s3);//false
//				
//				//compareto()
				System.out.println(s1.compareTo(s2));//0
				System.out.println(s1.compareTo(s3));//100  -   68 =32
				System.out.println(s1.compareTo(s4));//100 - 114= -14  
//				
//				//comparetoignorecase
//				System.out.println(s1.compareToIgnoreCase(s2));//0
//				System.out.println(s1.compareToIgnoreCase(s3));//0
//				System.out.println(s3.compareToIgnoreCase(s4));//100-114=-14
			}

		}
