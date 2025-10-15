import java.util.Scanner;
class AddNumbers{
     public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter numbers for addition");
		  int n1=sc.nextInt();		  
		  int n2=sc.nextInt();
		  if(n1<n2){
		      System.out.println("n1:"+n1+"N2:"+n2);
		  }
	}
}