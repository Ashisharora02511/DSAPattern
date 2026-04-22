package com.java.dsa.DSAPattern.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValueFromList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add(null);
        words.add("banana");
        words.add(null);

        List<String> filteredValues=words.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(filteredValues);
    }
}
