package com.lnt;

public class EmployeeTest {
    public static void main(String[] args) {
        // Employee emp1 = new Employee(23, "Ravi");

        ContractualEmployee contractualEmployee = new ContractualEmployee(3, "Priya", 10000);
        RegularEmployee regularEmployee = new RegularEmployee(2, "Sonia", 10000);

       Employee employees[] = { contractualEmployee, regularEmployee};

       for(Employee e : employees){
        e.incrementSalary();
        e.applyForLeave();
        System.out.println(e);
       }

    }
}
