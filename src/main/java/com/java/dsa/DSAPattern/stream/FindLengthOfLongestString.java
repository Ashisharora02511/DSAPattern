package com.java.dsa.DSAPattern.stream;

import java.util.Comparator;
import java.util.List;

public class FindLengthOfLongestString {
    public static void main(String[] args) {
        List<String> names=List.of("Amit","Suresh","Animesh","Vikram","apple","banana");
     String name=   names.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().orElse(null);
        System.out.println(name.length());


    }
}
