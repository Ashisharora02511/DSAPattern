package com.java.dsa.DSAPattern.stream;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class NoneMatchElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 56, 77);
        boolean result = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(result);
        String input = "ppppccccdddqqqaaa";
        HashMap<Character,Integer> result1=new HashMap<>();

        System.out.println(input.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting())));

    char [] chars=  input.toCharArray();
       for(char ch: chars){


           result1.put(ch,result1.getOrDefault(ch,0)+1) ;


       }
        System.out.println(result1);
    }
}

