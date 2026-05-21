package com.java.dsa.DSAPattern.stream;

import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {


    public static void main(String[] args) {
        List<Integer> list= List.of(3,18,5,15,10,54,23,1);

     int maxValue=   list.stream().sorted(Comparator.comparing(Integer::byteValue).reversed()).skip(1).findFirst().orElse(null);

        System.out.println(maxValue);


    }
}
