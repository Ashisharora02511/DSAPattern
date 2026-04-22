package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;
import java.util.List;

public class p3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 10, 30, 40);
        list.stream().sorted().skip(1).findFirst().ifPresent(System.out::println);
    }
}
