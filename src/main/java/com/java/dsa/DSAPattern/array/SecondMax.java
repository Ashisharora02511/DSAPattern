package com.java.dsa.DSAPattern.array;

public class SecondMax {

    public static int secondMax(int [] arr){
        int max=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>max){
                second=max;
                max=num;
            } else if (num>second&& num!=max) {
                second=num;
                
            }
        }
        return  second;
    }

    public static void main(String[] args) {
     int [] arr={11,2,23,7,15,19,78};

     int secondMax= secondMax(arr);
        System.out.println(secondMax);
    }
}
