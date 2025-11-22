import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse: "+rev);
		if(temp==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a number Palindrome");
		}

	}

}
