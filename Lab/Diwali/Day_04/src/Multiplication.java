import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=0;
		int i;
		int n=sc.nextInt();
		System.out.println("Table");
		for(i=1;i<=10;i++) {
			 num=n*i;
			 System.out.println(n+"*"+i+"--"+num);
		}
		
		

	}

}
