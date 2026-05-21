package com.java.dsa.DSAPattern.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestElementInList {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(23,12,4,52,12,65,13);
    int sortedNumber=  numbers.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println(sortedNumber);

    }
}
