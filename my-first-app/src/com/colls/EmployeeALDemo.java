package com.colls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeALDemo {
   public static void main(String[] args) {
     List<Employee> employees = new LinkedList<>();
     Employee e1 = new Employee(23, "abc");
     employees.add(e1);
     Employee e2 = new Employee(3, "axy");
     employees.add(e2);
    Employee e3 = new Employee(23, "abcd");

     System.out.println(e1.equals(e3));

     System.out.println(employees);
   } 
}
