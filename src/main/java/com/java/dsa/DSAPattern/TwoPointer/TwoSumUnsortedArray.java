package com.java.dsa.DSAPattern.TwoPointer;

import java.util.HashMap;

public class TwoSumUnsortedArray {


    public static void twoSumUnsortedArray(int[] arr, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
          if(!map.containsKey(arr[i]-target)) {}
          map.put(arr[i], i);
      }

    }
    public static void main(String[] args) {

    }
}
