package com.java.dsa.DSAPattern.array.Basic;

public class AccessElements {
    public static void main(String[] args) {
        int [] arr={12,23,12,45};
        for (int val:arr) {
            System.out.println(val);
        }
        //random acess
        int random=arr[3];
        System.out.println(random);

        ///index start from 0 and length -1
        //length 4
        // 0 to 3 ok
    }
}
