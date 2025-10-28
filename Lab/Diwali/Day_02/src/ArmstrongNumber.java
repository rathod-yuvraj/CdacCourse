import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        // Count number of digits
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        if (sum == original)
            System.out.println("True (Armstrong Number)");
        else
            System.out.println("False (Not an Armstrong Number)");

        sc.close();
    }
}
