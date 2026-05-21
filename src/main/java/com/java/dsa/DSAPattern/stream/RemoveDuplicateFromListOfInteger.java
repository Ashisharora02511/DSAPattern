package com.java.dsa.DSAPattern.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromListOfInteger {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,34,2,1,4,6,7,8,6,3);
        HashSet<Integer> sets=new HashSet<>();
        Set<Integer> getVkaues=   numbers.stream().collect(Collectors.toSet());
        System.out.println(getVkaues);
    }
}
