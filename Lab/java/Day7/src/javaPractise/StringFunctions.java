package javaPractise;

public class StringFunctions {
	
	public static void main (String [] args)
	{ 
		String s1 = "Test raj";
	  String s2 = "Test 2";
	  String s3 =s2;
	  
	  String  s4 = new String ("Test");

	  System.out.println("s2==s3"+ (s2 == s3));
	  System.out.println("s2==s4"+ (s2==s4));
	  System.out.println("s2.equals(s4)"+(s2.equals(s4)) );
	  s1 = "Welcome";
	  System.out.println("s2==s1"+(s2==s1));
	  
	
	  StringBuffer sbf = new StringBuffer("Hello");
	  System.out.println(sbf.append("Everyone"));
	  
	  
	  StringBuilder sbt=new StringBuilder("yuvraj");
	  System.out.println(sbt.append(" Rathod"));
      
	  
	  System.out.println( s1.indexOf("raj"));
	  
	}

}
