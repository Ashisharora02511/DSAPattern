package com.java.dsa.DSAPattern.stream;

import java.util.List;

public class ConvertListOfStringToUpperCase {

    public static void main(String[] args) {
        List<String>  list=List.of("ashish","arora","java","developer");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
