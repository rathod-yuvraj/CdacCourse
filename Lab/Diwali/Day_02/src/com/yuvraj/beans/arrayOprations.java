package com.demo.beans;

import java.util.Arrays;

public class ArrayData {
    private int[] arr;
    private int size;

    public ArrayData(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Array Elements: " + Arrays.toString(arr));
    }
}
