package com.java.dsa.DSAPattern.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListIntoSingle {
    public static void main(String[] args) {
        List<String> list=List.of("apple","banana","grape");
        List<String> list1=List.of("single","double","three");
      List<String> concate=  Stream.concat(list.stream(),list1.stream()).collect(Collectors.toList());
        System.out.println(concate);

    }
}
