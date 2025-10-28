import java.util.Scanner;

public class Max3Num {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 1at number: ");
        int n=obj.nextInt();
        System.out.println("Enter the 2st number: ");
        int n2=obj.nextInt();
        System.out.println("Enter the 3rd Number: ");
        int n3=obj.nextInt();

        System.out.println("num1: "+n+" num2: "+n2+" num3: "+n3);
        if((n<n2) && (n2<n3)){
            System.out.println("Max Number: "+n3);
        }
        else{
            System.out.println("not");
        }


    }
    
}
