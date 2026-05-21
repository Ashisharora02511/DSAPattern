package com.java.dsa.DSAPattern.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxSalaryEmpFromDept {
    public static void main(String[] args) {
        Employee employee=new Employee();
      List<Employee> lists=  employee.getEmp();

       lists.stream().collect(Collectors.groupingBy(Employee::getDepartment,  Collectors.collectingAndThen(
               Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
               opt -> opt.map(Employee::getName).orElse(null)


        )));


        HashMap<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1,"ashish");
        hashmap.put(2,"manoj");
        hashmap.put(3,"vipin");
        hashmap.put(4,"virat");
        String str="virat";


        System.out.println(hashmap);


    }
}
