package com.java.dsa.DSAPattern.TwoPointer;

public class TwoSum {
    public static void twoSum(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == target) {
                System.out.println(low + " " + high);
                break;
            }
            else if(sum < target){
                low++;
            }
            else {
                high--;
            }
        }

    }

    public static void main(String[] args) {
        twoSum(new int[]{3, 2, 4},6);
    }
}
