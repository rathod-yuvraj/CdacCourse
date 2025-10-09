package javaPractise;

import java.util.Arrays;

public class StrBuildinFun {

	public static void main(String[] args) {
		String str="Yuvraj rathod ,a,b,c,d,e";
		
		System.out.println("indexOf: "+str.indexOf("rathod"));
		System.out.println("toLower: "+str.toLowerCase());
		System.out.println("ToUpperCase(): "+str.toUpperCase());
		
		System.out.println("Split: "+str.split(","));
		
		
		String str1 = "apple,banana,cherry";
		System.out.println("Split: " + Arrays.toString(str1.split(",")));
		
		for(int i=0;i<str.length();i++) {
			System.out.println("Print the One Alphabet: "+str.charAt(i));
		}
		
		System.out.println("Match: "+str.matches(str1));
 
		String s2=new String("hello");
		String s1=new String("Hello");
		s1.equals(s1);
		System.out.println("Equal method:"+s1.equals(s1));

	}

}
