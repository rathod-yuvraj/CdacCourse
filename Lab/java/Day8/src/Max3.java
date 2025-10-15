import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		
		int n2 = sc.nextInt();
		
		System.out.println("enter num 3");
		
		int n3 = sc.nextInt();
		
		if( (n1==n2) && (n1==n3)){
			System.out.println("NUmbers are Equal");
		}else 
			if((n1>n2) && (n1>n3)) {
				  System.out.println("n1 is greater :"+n1);
			}

	}
			
		 


}
