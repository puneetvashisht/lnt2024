package com.lnt;

public class ContractualEmployee extends Employee {
    
    public ContractualEmployee(int i, String string, int j) {
        this.id = i;
        this.name = string;
        this.setSalary(j);
    }

    @Override
    void incrementSalary() {
       this.setSalary(this.getSalary() + 5000);
    }
}
