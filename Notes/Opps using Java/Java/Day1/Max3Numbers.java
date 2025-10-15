import java.util.Scanner;
class Max3Numbers{
     public static void main(String[] args){
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter numbers 1");
		  int n1=sc.nextInt();
          System.out.println("enter numbers 2");		  
		  int n2=sc.nextInt();
		  System.out.println("enter numbers 2");		  
		  int n3=sc.nextInt();
		  if((n1==n2) && (n1==n3)){
		    System.out.println("numbers are equal");
		  }else{
			  if((n1>n2) && (n1>n3)){
				  System.out.println("n1 is greater: "+n1);
			  }else if((n2>n1) && (n2>n3)){
				  System.out.println("n2 is greater: "+n2);
			  }else{
				  System.out.println("n3 is greater: "+n3);
			  }
		  } 
	}
}