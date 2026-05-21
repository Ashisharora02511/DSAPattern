package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToSingleList {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Spring", "Boot");

     String result=   list.stream().collect(Collectors.joining(","));
        System.out.println(result);
    }
}
