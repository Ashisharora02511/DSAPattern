package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParitionByEvenOdd {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();

        List<Integer> numbers= IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
      Map<Boolean,List<Integer>> lists= numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even List:"+lists.get(true));
        System.out.println("Odd List"+lists.get(false));
        System.out.println("End Time"+(System.currentTimeMillis()-startTime));

        // parell stream

        long startTime1=System.currentTimeMillis();

        List<Integer> numbers1= IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
        Map<Boolean,List<Integer>> lists1= numbers1.stream().parallel().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even List:"+lists1.get(true));
        System.out.println("Odd List"+lists1.get(false));
        System.out.println("End Time1"+(System.currentTimeMillis()-startTime1));
    }
}
