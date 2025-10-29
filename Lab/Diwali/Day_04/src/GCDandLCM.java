import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int num1 = a, num2 = b;
        
        // Find GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int gcd = a;
        int lcm = (num1 * num2) / gcd;
        
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
