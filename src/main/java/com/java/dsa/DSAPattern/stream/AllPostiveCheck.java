package com.java.dsa.DSAPattern.stream;

import java.util.List;

public class AllPostiveCheck {

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,3,4,6,8);
        boolean result=numbers.stream().allMatch(n->n>0);
        System.out.println(result);
    }




}
