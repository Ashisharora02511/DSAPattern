package com.java.dsa.DSAPattern.stream;

import java.util.List;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }



    public List<Employee> getEmp(){
        List<Employee> employees = List.of(
                new Employee("Ashish", "IT", 50000),
                new Employee("Rahul", "IT", 70000),
                new Employee("Neha", "HR", 40000),
                new Employee("Priya", "HR", 60000)
        );
        return  employees;
    }


}
