import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        boolean status = true;

	        if (num <= 1) {
	            status = false; 
	        } else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    status = false;
	                    break;
	                }
	            }
	        }

	        if (status)
	            System.out.println(num + " is a Prime Number.");
	        else
	            System.out.println(num + " is NOT a Prime Number.");

	        sc.close();
	    }
	

}
