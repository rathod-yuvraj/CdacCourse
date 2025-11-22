import java.util.Scanner;

public class CheckAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isAlphanumeric = str.matches("[A-Za-z0-9]+");

        if (isAlphanumeric) {
            System.out.println("The string contains only alphanumeric characters.");
        } else {
            System.out.println("The string contains special characters or spaces.");
        }
    }
}
