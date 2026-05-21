package com.java.dsa.DSAPattern.array.Basic;

public class UpdateAnElements {

    public static void main(String[] args) {
        int [] arr={12,23,12,45};
        for (int i =0;i< arr.length;i++) {
           arr[i]=arr[i]+2;
            System.out.println(arr[i]);
        }
        arr[2]=34;
        for (int i =0;i< arr.length;i++) {

            System.out.println(arr[i]);
        }
    }
}
