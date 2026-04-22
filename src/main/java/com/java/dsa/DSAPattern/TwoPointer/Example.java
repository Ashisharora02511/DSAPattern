package com.java.dsa.DSAPattern.TwoPointer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String str="abcabbb";

         str.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(c->c.getValue()==1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
    }



}
