package com.java.dsa.DSAPattern.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FindPalindromicStringInList {

    public static boolean checkPalindromic(String str){
        String originalStr=str;
        String reversedString=new StringBuilder(originalStr).reverse().toString();
        System.out.println(reversedString);
        if(str.equals(reversedString)){


            return true;
        }

     return false;


    }

    public static void main(String[] args) {
        List<String> names=List.of("apple","madam","racecar","banana","level");



        List<String> Filternames=    names.stream().filter(FindPalindromicStringInList::checkPalindromic).collect(Collectors.toList());
        System.out.println(Filternames);
    }
}
