import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Using formula: sum = n * (n + 1)
        int sum = n * (n + 1);

        System.out.println("Sum of first " + n + " even numbers = " + sum);
        sc.close();
    }
}
