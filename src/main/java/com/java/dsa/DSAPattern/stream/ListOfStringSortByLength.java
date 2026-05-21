package com.java.dsa.DSAPattern.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringSortByLength {

    public static void main(String[] args) {
        List<String> name=List.of("Ashish","mainu","deep","see");
     List<String> sortedNames=  name.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
