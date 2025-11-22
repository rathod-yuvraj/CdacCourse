import java.util.Scanner;

public class SumOddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Using formula: sum = n²
        int sum = n * n;

        System.out.println("Sum of first " + n + " odd numbers = " + sum);
        sc.close();
    }
}
