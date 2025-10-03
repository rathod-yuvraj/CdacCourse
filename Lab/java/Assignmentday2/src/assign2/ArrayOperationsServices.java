package assign2;

public class ArrayOperationsServices {
	
	public static boolean isPrime(int n) {
		 
		for (int i=2;i<n;i++) {
			
			if(n%i==0) {
				
				return false;
			}
			
		}
		
		return true;
		
	}
	public static void checkArrayPrimes(int[] arr) {
	    for (int num : arr) {
	        if (isPrime(num)) {
	            System.out.println(num + " is Prime");
	        } else {
	            System.out.println(num + " is Not Prime");
	        }
	    }
	}


}
