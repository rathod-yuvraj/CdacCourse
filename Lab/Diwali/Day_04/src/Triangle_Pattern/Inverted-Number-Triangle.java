import java.util.Scanner;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        for (int i = r; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}

    }
}
