package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p1 {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);
        Set<Integer>  sets=new HashSet<>();

        list.stream().filter(i->!sets.add(i)).forEach(System.out::println);
    }
}
