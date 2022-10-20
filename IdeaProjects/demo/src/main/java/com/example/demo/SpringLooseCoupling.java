package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLooseCoupling {
    public static void main(String[] args) {
        //LOOSELY COUPLED CODE
        BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgorithm());
        int result=binarySearch.binarySearch(new int[] {1,2,3,4,5,6,7,8,9,10},6);
        if(result==-1)
            System.out.println("Value isn't found");
        else
            System.out.println("The value is found at index: "+result);



    }
}
