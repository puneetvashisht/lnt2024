package com.lnt;

public class RegularEmployee extends Employee {

    public RegularEmployee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.setSalary(salary);
    }

    @Override
    void incrementSalary() {
        this.setSalary(this.getSalary() * 1.1);
        // this.salary *= 1.1;
    }
    
}
