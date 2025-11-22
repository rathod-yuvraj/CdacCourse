package com.demo.array;

public class Arrayfactorial {
	
	public static boolean isPrime(int num) {
		
		for (int i = 2;i<Math.sqrt(num);i++) {
			
			if(num%i==0) {
				return false;
			
			}
			
		}
		
		return true;
		
	}
	
	public static void fact (int num ) {
		int factorial= 1;
		for (int i = 1;i<num;i++) {
			factorial += factorial * i;
			
		}
		System.out.println("num: "+num + " Factorial: "+ factorial);
		
	}
	
	
	
public static void main (String []args) {
	Arrayfactorial a=new Arrayfactorial();
	int[] arr= {12,65,34,5,3,76,87};
	fact (5);
	int number=9;
	
	if (isPrime(number)) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is NOT a prime number.");
    }
//	 Find factorial of only prime  numbers in the array 
	 System.out.println("Factorials of prime numbers in the array:");
     for (int num : arr) {
         if (isPrime(num)) {

              fact(num);
         }
     }
}
	
	
}
	
	
            
	

