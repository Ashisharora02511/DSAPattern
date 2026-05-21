package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean checkPrimeNum(int num){

        if (num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
     List<Integer> number=   IntStream.range(1,101).filter(PrimeNumber::checkPrimeNum).boxed().collect(Collectors.toList());
        System.out.println(number);

    }
}
