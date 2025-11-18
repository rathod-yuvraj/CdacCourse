package com.demo.beans;

public class S{
    // Corrected method signature: includes public, static, return type (int),
    // and correctly formatted parameters (int[] arr, int search).
    public static int sequenceSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                // CORRECTION: If the element is found, return its index (i).
                return i;
            }
        }
        // If the loop finishes without returning, the element was not found.
        // Return -1 to indicate failure.
        return -1;
    }
}