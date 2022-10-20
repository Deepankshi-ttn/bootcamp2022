package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        int n =numbers.length;
        int temp =0;
        for(int i=0;i<n;i++){
            for(int j =1;j<(n-1);j++)
            {
                if(numbers[j-1]>numbers[j]){
                    //swap elements
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
                }
            }
        return numbers;
    }
}
