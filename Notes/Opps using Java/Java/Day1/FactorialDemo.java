import java.util.Scanner;

class TestFunction{
    public static int factorial(int n){
	if(n<=1)
	   return 1;
	else{
	      int f=1;
		  for(int i=1;i<=n;i++){
		  f=f*i;
		  }
		  return f;
    }
	
	}
    public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number");
	   int n=sc.nextInt();
	   //if the function is static function and within same class
	   int ans=factorial(n);
	   System.out.println("Factorial : "+ans);
	   //if the function is static function and in different class
	   ans=TestFunction.factorial(n);
	   //if the function is not static function
	   //TestFunction ob=new TestFunction();
	   //ans=ob.factorial(n);
	   System.out.println("Factorial : "+ans);
	
	}
}