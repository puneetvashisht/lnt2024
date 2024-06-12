package com.lnt;

public class Employee {
    
    // Fields/Properties/State
    int id;
    String name;
    private double salary;
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary>0){
            this.salary = salary;
        }
       
    }
    public Employee(){
        
    }
    public Employee(int id, String name, double s){
        this.id = id;
        this.name = name;
        salary = s;
    }

    // methods/behaviour/funcitons
    void incrementSalary(){
        this.salary = this.salary * 1.1;
    }

    

    //  public String toString(){
    //     return "ID: "+ this.id + " Salary " + this.salary;
    // }


    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }



   
}
