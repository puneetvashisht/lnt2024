package com.lnt;

public class ContractualEmployee extends Employee {
    double payPerMonth;

    public ContractualEmployee(int id, String name) {
        // super(id, name);
        this(id, name, 5000.00);
     }
    
    public ContractualEmployee(int id, String name, double payPerMonth) {
       super(id, name);
        this.payPerMonth = payPerMonth;
       
    }

    @Override
    void incrementSalary() {
       this.payPerMonth += 5000;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        
        System.out.println(super.name);
        return "ContractualEmployee [payPerMonth=" + payPerMonth + ", id=" + id + ", name=" + name + "]";
    }

    
}
