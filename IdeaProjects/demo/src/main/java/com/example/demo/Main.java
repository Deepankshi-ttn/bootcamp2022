package com.example.demo;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        BinarySearchImpl ob = new BinarySearchImpl(new BubbleSortAlgorithm());
        int num= ob.binarySearch(intArray,9);
        System.out.println("The value is found at index " + num);
       // System.out.println(num);numToSearch
    }
}
