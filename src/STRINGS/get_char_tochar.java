package STRINGS;

import java.util.Arrays;

public class get_char_tochar {

	public static void main(String[] args) {

		String s1="java full stack";
		char dest[]=new char[15];
		//getchar(int srcbegin,int srcend,char dst[],int dstbegin)
		s1.getChars(0, 15, dest, 0);
		System.out.println(Arrays.toString(dest));
		
		String s="king";
		char d[]=s.toCharArray();;
		for(int i=0;i<d.length;i++)
			{
				System.out.println(d[i]);
			}
		
	
		
		
		
//		for(int i=0;i<dest.length;i++)
//			{
//				System.out.println(dest[i]);
//			}
		//System.out.print(Arrays.toString(dest));
//		int i;
//		String s2="hyderabad";
//		char c[]=s2.toCharArray();
//		for(i=0;i<s2.length();i++)
//		{
//			System.out.print(c[i]+"\t");
//		}
	}

}
