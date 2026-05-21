package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FindElementsgreateThan {
    public static void main(String[] args) {
        List<Integer> list=List.of(12,23,45,7,89,6,4);
      List<Integer> filters=  list.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println(filters);
    }
}
