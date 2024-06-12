package com.lnt;

public class RegularEmployee extends Employee  {

    public RegularEmployee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.setSalary(salary);
    }
    private double salary;
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
       
    }
    @Override
    void incrementSalary() {
        this.setSalary(this.getSalary() * 1.1);
        // this.salary *= 1.1;
    }
    @Override
    public String toString() {
        return "RegularEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
   
  

    
    
}
