import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 1. Accept int
        System.out.println("Enter integer (n):");
        int n = sc.nextInt ();
        
        // 2. Clear the newline left by nextInt()
        sc.nextLine(); 
        
        // 3. Accept float - CORRECTED METHOD
        System.out.println("Enter Float (n1):");
        float n1 = sc.nextFloat();
        
        // 4. Clear the newline left by nextFloat()
        sc.nextLine(); 
        
        // 5. Accept String (using nextLine() to read a full line, including spaces)
        System.out.println("Enter string (n2):");
        String n2 = sc.nextLine();
        
        // 6. Accept another String
        System.out.println("Enter String (n3):");
        String n3 = sc.nextLine();
        
        // Output the values
        System.out.println("\n--- Output ---");
        System.out.println("int: " + n);
        System.out.println("float: " + n1);
        System.out.println("string 1: " + n2);
        System.out.println("string 2: " + n3);
        
        sc.close(); // Good practice to close the Scanner
	}
}