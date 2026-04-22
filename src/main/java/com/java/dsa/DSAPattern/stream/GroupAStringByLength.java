package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAStringByLength {
    public static void main(String[] args) {
        List<String> words=List.of("apple","banana","pear","grape","kiwi","orange");
        Map<Integer, List<String>> groups=  words.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(groups);
    }
}
