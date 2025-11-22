import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int rem = n % 10;          
            reversed = reversed * 10 + rem; 
            n = n / 10;               
        }

        if (original == reversed)
            System.out.println("True (Palindrome Number)");
        else
            System.out.println("False (Not a Palindrome)");

        sc.close();
    }
}
