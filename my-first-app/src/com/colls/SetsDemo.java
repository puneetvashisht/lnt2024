package com.colls;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        
        Set<String> list = new HashSet<>();
        list.add("apple");
        list.add("apple");
        System.out.println(list);

        Set<String> list2 = new TreeSet<>();
        list2.add("pineapple");
        list2.add("grapes");
        list2.add("apple");
        System.out.println(list2);

        Set<Employee> employees = new LinkedHashSet<>();
        Employee e1 = new Employee(23, "abc");
        employees.add(e1);
        Employee e2 = new Employee(3, "axy");
        employees.add(e2);
        Employee e21 = new Employee(3, "axy");
        employees.add(e21);
       Employee e3 = new Employee(24, "abcd");
       employees.add(e3);
       System.out.println(employees);
        
       System.out.println(employees.contains(new Employee(344, "dd")));



    }
}
