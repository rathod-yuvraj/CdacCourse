package Basic;

public class fibnacci {
public static int recursive_fib(int n) {
	if(n==0) return 0;
	if(n==1) return 1;
	return recursive_fib(n-1)+recursive_fib(n-2);
	
}
}