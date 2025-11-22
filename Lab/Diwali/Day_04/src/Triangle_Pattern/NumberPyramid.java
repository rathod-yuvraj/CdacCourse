import java.util.Scanner;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
    // Print spaces
    for (int s = i; s < r; s++) {
        System.out.print(" ");
    }
    // Print increasing numbers
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    // Print decreasing numbers
    for (int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }
    System.out.println();
}


    }
}
