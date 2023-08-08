package STRINGS;

public class Count_vowel_nd_constant {

	public static void main(String[] args) {
String s="Apple";
		
		int v=0;
		int c=0;
		
		char s1[] = s.toCharArray();
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U'||s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u')
				{
					v++;
				}
			
			else
			{
				c++;
			}
		}
		
	System.out.println("total vowels: "+v);
	System.out.println("total constants: "+c);

	}

}
