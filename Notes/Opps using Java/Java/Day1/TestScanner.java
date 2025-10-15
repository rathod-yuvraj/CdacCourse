import java.util.Scanner;

class TestScanner{
  public static void main(String args[]){
  
     Scanner sc=new Scanner(System.in);
	 //accept int
	 System.out.println("Enter integer");
	 int n=sc.nextInt();
	 //accept float
	 System.out.println("Enter float");
	 float n1=sc.nextFloat();
	 //accept string without spaces, next terminates 
	 //with space or \n
	 System.out.println("Enter string");
	 String s=sc.next();
	  //accept string with spaces, nextLine 
	  //it terminates with \n
	  sc.nextLine();
	 System.out.println("Enter string");
	 String str1=sc.nextLine();
	 System.out.println("Integer "+n);
	 System.out.println("Float "+n1);
	 System.out.println("String without spaces "+s);
	 System.out.println("String with spaces "+str1);
	 sc.close();
  }


}