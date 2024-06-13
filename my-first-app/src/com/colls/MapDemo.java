package com.colls;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        
        Map<Integer, Employee> employeeMap = new TreeMap<>();

        Employee e1 = new Employee(23, "abc");
       employeeMap.put(23, e1);
        Employee e2 = new Employee(3, "axy");
        employeeMap.put(3, e2);
        Employee e21 = new Employee(3, "axy");
        employeeMap.put(3, e21);
       Employee e3 = new Employee(24, "abcd");
       employeeMap.put(24, e3);


       Set<Integer> keys = employeeMap.keySet();
       System.out.println(keys);

       for(Integer key: keys){
        System.out.println(employeeMap.get(key));
       }

       System.out.println(employeeMap.get(24));
    }
}
