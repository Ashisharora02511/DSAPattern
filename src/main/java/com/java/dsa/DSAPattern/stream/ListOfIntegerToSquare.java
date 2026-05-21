package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegerToSquare {
    public static void main(String[] args) {
        List<Integer> listSquare=List.of(1,23,3,4,5,6,7);
        List<Integer> listSquare1= listSquare.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(listSquare1);
    }
}
