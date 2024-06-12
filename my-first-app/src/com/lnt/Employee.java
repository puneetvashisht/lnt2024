package com.lnt;

public abstract class Employee implements Perks{
    
    // Fields/Properties/State
    int id;
    String name;
   
    public Employee(){
        
    }
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // methods/behaviour/funcitons
    // void incrementSalary(){
    //     // this.salary = this.salary * 1.1;
    // }

    abstract void incrementSalary();

    public void applyForLeave(){
        System.out.println("Leave application pending..");
    }

    

    //  public String toString(){
    //     return "ID: "+ this.id + " Salary " + this.salary;
    // }


    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    @Override
    public void medicalAssurance() {
       System.out.println("Medi Assist Cover 5 lacs");
    }
    @Override
    public void foodCoupon() {
       System.out.println("SmartQ food coupon");
    }

   
}
