package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;
    public BinarySearchImpl(SortAlgorithm sortAlgorithm)
    {
        super();
        this.sortAlgorithm=sortAlgorithm;
    }
    public int binarySearch(int[] numbers,int numToSearch)
    {
        //TIGHTLY COUPLED CODE
        BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
        int[] sortedNumbers=bubbleSortAlgorithm.sort(numbers);
        int i=0,j=sortedNumbers.length-1;
        System.out.println(sortAlgorithm);
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(numbers[mid]==numToSearch)
                return mid;
            else  if(numbers[mid]<numToSearch)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }

        }

        return -1;
    }


}

