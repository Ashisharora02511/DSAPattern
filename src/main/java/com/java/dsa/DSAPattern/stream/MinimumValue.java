package com.java.dsa.DSAPattern.stream;

import java.util.Comparator;
import java.util.List;

public class MinimumValue {
    public static void main(String[] args) {
        List<Integer> number=List.of(12,34,56,34,23,4,5,2);
        System.out.println( number.stream().min(Comparator.comparing((a->a))).get());
    }

}
