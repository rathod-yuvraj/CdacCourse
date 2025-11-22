package basic;

public class Factorial {
	
	public long factorial(long num) {
		if(num<=1)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	public int Print(int n) {
		if(n==0) {
			return 0;
		}
		else {
			System.out.println(n);
			return Print(n-1);
		}
	}

	public static void main(String[] args) {
		
		Factorial fab=new Factorial();
		fab.Print(10);
		for(int counter=0;counter<=10;counter++) {
			System.out.print(" "+fab.factorial(counter));
		}
		
	}

}
