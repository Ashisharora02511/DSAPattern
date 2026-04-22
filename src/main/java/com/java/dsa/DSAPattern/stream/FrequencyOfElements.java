package com.java.dsa.DSAPattern.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElements {

    public static void main(String[] args) {
        List<String> words= List.of("Apple","Banana","Apple","Apple","Banana","Kiwi");

      Map<String, Long> lists=  words.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(lists);


        //using hashmap
        HashMap<String,Integer> values=new HashMap();
         for(String word:words){
             values.put(word,values.getOrDefault(word,0)+1);

         }
        System.out.println(values);




    }







}
