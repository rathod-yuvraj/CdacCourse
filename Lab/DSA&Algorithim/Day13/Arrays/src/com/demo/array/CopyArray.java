package com.demo.array;

import java.util.Arrays;

public class CopyArray {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Helper method to reverse a number
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 11, 13, 23};
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) && arr[i] < 5) {
                copyArr[i] = reverseNumber(arr[i]); // reverse if prime and <5
            } else {
                copyArr[i] = arr[i]; // copy as is
            }
        }

        // Print result
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
//        for (int n : arr) {
//            System.out.print(n + " ");
//        }

        System.out.println("\nCopied Array:");
        System.out.println(Arrays.toString(copyArr));
//        for (int n : copyArr) {
//            System.out.print(n + " ");
//        }
    }
}
