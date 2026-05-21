package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class SkipElementIntoList {
    public static void main(String[] args) {

        List<Integer> number=List.of(1,3,4,5,6,7,9);
        List<Integer> skipNumber=number.stream().skip(3).collect(Collectors.toList());
        System.out.println(skipNumber);
    }
}
