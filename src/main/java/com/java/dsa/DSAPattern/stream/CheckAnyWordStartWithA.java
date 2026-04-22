package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAnyWordStartWithA {
    public static void main(String[] args) {
        List<String> names=List.of("Amit","Suresh","Animesh","Vikram","apple","banana");
        List<String> startWithA=names.stream().filter(name->name.toUpperCase().startsWith("A")).collect(Collectors.toList());
        System.out.println(startWithA);
    }
}
