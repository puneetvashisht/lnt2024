package com.lnt;

public class Employee extends Object {

    public Employee(){
        super();
    }
    
    int id;

    public Employee(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + "]";
    }
    
}
