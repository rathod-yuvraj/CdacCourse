import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (from 0 to n, one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Formula for sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}
