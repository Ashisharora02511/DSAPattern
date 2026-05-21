package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectOddNumIntoSet {

    public static void main(String[] args) {
        List<Integer>numbers= List.of(1,3,4,2,56,78,98,34,23,11,45);
        List<Integer> oddNumbers=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
