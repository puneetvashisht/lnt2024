package com.lnt;

public class ContractualEmployee extends Employee {

    double payPerMonth;
    
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
        return "ContractualEmployee [payPerMonth=" + payPerMonth + ", id=" + id + ", name=" + name + "]";
    }

    
}
