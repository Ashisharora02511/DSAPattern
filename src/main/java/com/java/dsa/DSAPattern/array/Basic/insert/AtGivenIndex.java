package com.java.dsa.DSAPattern.array.Basic.insert;

public class AtGivenIndex {
    public static void main(String[] args) {
        int [] arr={12,23,12,45};
        int [] newArr=new int[arr.length+1];
        System.out.println(arr.length);
        for (int i =0;i< arr.length;i++) {

            System.out.println(arr[i]);
        }

        for (int i =0;i< arr.length;i++) {

                newArr[i]=arr[i];


        }
        newArr[2]=10;
        for (int i =2;i< arr.length;i++) {

            newArr[i+1]=arr[i];
        }
        for (int i =0;i< newArr.length;i++) {

            System.out.println(newArr[i]);
        }
    }
}
