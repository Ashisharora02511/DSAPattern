package com.java.dsa.DSAPattern.stream;

import java.util.List;

public class FirstElementFromList {

    public static void main(String[] args) {
        List<String> list= List.of("Apple","Banana","Grapes");

        String firstElement= list.stream().findFirst().orElse(null);
        System.out.println(firstElement);
    }
}
