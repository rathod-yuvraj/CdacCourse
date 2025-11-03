
import java.util.Scanner;

public class AddNumberScanner {

    public static void main(String[] args) {
        System.out.println("Enter the First Number: ");
        Scanner obj=new Scanner(System.in);
       int n1= obj.nextInt();
       System.out.println("Enter the Second Number: ");
       int n2=obj.nextInt();
       int sum=n1+n2;
       System.out.println("Additions Of Two Number: "+sum);

        
    }

    
}
