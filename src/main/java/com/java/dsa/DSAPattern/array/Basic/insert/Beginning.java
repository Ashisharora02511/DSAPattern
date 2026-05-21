package com.java.dsa.DSAPattern.array.Basic.insert;

public class Beginning {


    public static void main(String[] args) {
        int [] arr={12,23,12,45};
        int [] newArr=new int[arr.length+1];

        System.out.println(arr.length);
        for (int i =0;i< arr.length;i++) {

            System.out.println(arr[i]);
        }
        newArr[0]=10;
        System.out.println(newArr.length);
        for (int i =0;i< arr.length;i++) {

            newArr[i+1]=arr[i];
        }
        for (int i =0;i< newArr.length;i++) {

            System.out.println(newArr[i]);
        }
    }
}
