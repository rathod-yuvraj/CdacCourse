import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n > 0) {
            int rem = n % 10;     // Get last digit
            rev = rev * 10 + rem; // Append it to reversed number
            n /= 10;              // Remove last digit
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
