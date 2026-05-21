package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 3, 5, 6, 7, 8);
        List<Integer> newList = list.stream().filter(n -> n < 5).collect(Collectors.toList());
        System.out.println(newList);
    }

}
