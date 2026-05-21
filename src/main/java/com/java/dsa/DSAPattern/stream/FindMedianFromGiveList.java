package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FindMedianFromGiveList {

    public static double findMedian(List<Integer>numbers){


     List<Integer> sortedNumber=   numbers.stream().sorted().collect(Collectors.toList());

     int size=   sortedNumber.size();

     if(size%2==0){
         return sortedNumber.get((size/2-1)+(size/2))/2.0;

     }
         return sortedNumber.get(size/2);

    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 4, 5, 5, 3, 1, 12);

       double mediad= findMedian(numbers);
        System.out.println(mediad);
    }
}
