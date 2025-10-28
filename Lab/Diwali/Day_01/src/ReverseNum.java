import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		int sum=0;
		int rem=0;
		int rev=0;
		while(num>0) {
			rem=num%10;
			 rev= rev*10+rem;
			sum+=rem;
		
			num=num/10;
			
		}
		System.out.println("Sum of digit: "+sum);
		System.out.println("remainderReverse : " +rev);

	}

}
