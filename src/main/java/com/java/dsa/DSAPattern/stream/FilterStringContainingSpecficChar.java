package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringContainingSpecficChar {
    public static void main(String[] args) {

        List<String> names= List.of("apple","banana","kiwi","blueberry","grapes");

      List<String>  filterName=  names.stream().filter(n-> !n.contains("a")).collect(Collectors.toList());
        System.out.println(filterName);
    }



}
