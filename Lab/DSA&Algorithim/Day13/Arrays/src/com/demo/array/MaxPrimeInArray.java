package com.demo.array;

import java.util.Arrays;

public class MaxPrimeInArray {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to find maximum prime in array
    public static int findMaxPrime(int[] arr) {
        int maxPrime = -1; // -1 means no prime found
        for (int num : arr) {
            if (isPrime(num) && num > maxPrime) {
                maxPrime = num;
            }
        }
        return maxPrime;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 54, 76,17, 87, 34};
        int maxPrime = findMaxPrime(arr);

        if (maxPrime != -1) {
            System.out.println("Maximum prime in array: " + maxPrime);
        } else {
            System.out.println("No prime numbers found in array.");
        }
    }
}
