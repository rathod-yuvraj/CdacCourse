package com.demo.array;

public class MyArray {
    public int[] arr;
    int index;

    // Default constructor
    public MyArray() {
        this.arr = new int[10];
        this.index = 0;
    }

    // Constructor with custom size
    public MyArray(int size) {
        this.arr = new int[size];
        this.index = 0;
    }

    // Insert data into array
    public void insertData(int num) {
        if (index < arr.length) {
            arr[index] = num;
            index++;
        } else {
            System.out.println("Array is full, cannot insert more data.");
        }
    }

    // Sum of digits of a number
    public int add(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        return sum;
    }

    // Sum of digits for each element in array
    public int[] additionArr(int[] inputArr) {
        int[] sumArr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            sumArr[i] = add(inputArr[i]);
        }
        return sumArr;
    }

    // Display array elements
    public void display() {
    	
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    // Test main method
//    public static void main(String[] args) {
//        MyArray myArray = new MyArray(5);
//        myArray.insertData(123);
//        myArray.insertData(456);
//        myArray.insertData(789);
//
//        myArray.display();
//
//        int[] sums = myArray.additionArr(myArray.arr);
//        System.out.println("Digit sums of array elements:");
//        for (int s : sums) {
//            System.out.print(s + " ");
//        }
//    }
}
