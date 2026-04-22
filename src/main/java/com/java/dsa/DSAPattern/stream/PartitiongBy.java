package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitiongBy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 5, 30);
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0)));
    }
}
