import java.util.*;
public class testPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        
        int number = sc.nextInt();
        
        boolean status = primeService.isPrime(number);
        
        if(status) {
            System.out.println("This number is Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
        sc.close();
    }

}
