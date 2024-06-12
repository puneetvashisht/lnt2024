package com.lnt;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(23, "Ravi", 34344.34);

        ContractualEmployee contractualEmployee = new ContractualEmployee(23, "Ravi", 10000);
        contractualEmployee.incrementSalary();

        System.out.println(contractualEmployee);
        // emp1.id = 23;
        // emp1.name = "Ravi";
        // emp1.salary = 34344.34;
        
        // Employee emp2 = new Employee();
        // emp2.id = 22;
        // emp2.name = "Priya";
        // // emp2.salary = -44344.34;
        // emp2.setSalary(334343.33);

        // System.out.println(emp1);
        // emp1.incrementSalary();
        // System.out.println(emp1);

        // System.out.println(emp1.toString());
        // System.out.println(emp2.getSalary());

    }
}
