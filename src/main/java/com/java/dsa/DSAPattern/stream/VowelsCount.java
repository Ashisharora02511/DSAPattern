package com.java.dsa.DSAPattern.stream;

import java.util.Arrays;

public class VowelsCount {


    public static void main(String[] args) {
        String str="This is java developer and am doing this";
      long counts=  str.chars().mapToObj(ch->(char)ch).filter(ch->"aeiou".indexOf(ch)!=-1).count();
        System.out.println(counts);
    }
}
