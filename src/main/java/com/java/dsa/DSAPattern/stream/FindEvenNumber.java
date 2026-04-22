package com.java.dsa.DSAPattern.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindEvenNumber {


    public static void main(String[] args) {

        // find even number from sream
        Stream.of(1,2,3,4,5,6,8,9).filter(i->i%2==0).forEach(System.out::println);

        // range of number
        IntStream.range(1,100).filter(num->num%2==0).forEach(System.out::println);


    }
}
