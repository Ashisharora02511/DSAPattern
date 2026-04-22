package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAListOfList {

    public static void main(String[] args) {
        List<Integer> list1= List.of(1,2,3,4,5);
        List<Integer> list2= List.of(6,7);
        List<Integer> list3= List.of(8,9,10);


      List< List<Integer>> singleList= Arrays.asList(list1,list2,list3);

      List<Integer> resultList=singleList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(resultList);

    }
}
