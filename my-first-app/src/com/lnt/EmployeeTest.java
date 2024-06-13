package com.lnt;

public class EmployeeTest {
    public static void main(String[] args) {
        // Employee emp1 = new Employee(23, "Ravi");

        ContractualEmployee contractualEmployee = new ContractualEmployee(3, "Priya");
        RegularEmployee regularEmployee = new RegularEmployee(2, "Sonia", 10000);

       Employee employees[] = { contractualEmployee, regularEmployee};

       System.out.println(contractualEmployee.toString());

    //    for(Employee e : employees){
    //     e.incrementSalary();
    //     e.applyForLeave();
    //     System.out.println(e);
    //    }

    }
}
