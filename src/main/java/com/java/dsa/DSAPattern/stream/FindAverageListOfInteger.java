package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FindAverageListOfInteger {

    public static void main(String[] args) {
        List<Integer> number=List.of(12,34,56,34,23,4,5,2);
       double val= number.stream().collect(Collectors.averagingDouble(n->n)).doubleValue();
        System.out.println(val);
    }
}
