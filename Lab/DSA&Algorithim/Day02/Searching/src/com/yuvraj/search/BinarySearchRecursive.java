package com.yuvraj.search;

public class BinarySearchRecursive {

    static int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }

        // Element is not present in array
        return -1;
    }
    
    public static void main(String arg[]) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int x = 10;
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result != -1)
            System.out.println("Element is present at index " + result);
        else
            System.out.println("Element is not present in array");
    }
}
