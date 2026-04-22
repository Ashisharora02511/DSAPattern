package com.java.dsa.DSAPattern.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementInList {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6,12,1,5,6);
        List<Integer> duplicates=numbers.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream()
                .filter(n->n.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        HashSet<Integer> seen=new HashSet<>();
      List<Integer> nums=  numbers.stream().filter(i->!seen.add(i)).collect(Collectors.toList());
        System.out.println(nums);

        System.out.println(seen);
    }




}
