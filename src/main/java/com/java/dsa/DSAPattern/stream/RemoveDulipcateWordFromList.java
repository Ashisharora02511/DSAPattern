package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDulipcateWordFromList {
    public static void main(String[] args) {
        List<String> list=List.of("apple","banana","apple","orange","banana","grape");
       List<String> distinctValues=  list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctValues);


    }
}
