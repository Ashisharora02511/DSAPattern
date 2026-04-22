package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MAxFromListOfInteger {
    public static void main(String[] args) {
        List<Integer> listOfInteger= Arrays.asList(1,3,4,6,12,45,21,67,11);
        int max= listOfInteger.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
      int maximum=  listOfInteger.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);
        System.out.println(maximum);

    }
}
