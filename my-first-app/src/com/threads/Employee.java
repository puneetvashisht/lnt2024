package com.threads;

public class Employee extends Object{
    int id;
    String name;
    double salary;
    static String COMPANY_NAME = "L&T Mindtree";

    public static String getCOMPANY_NAME() {
        // System.out.println(name);
        return COMPANY_NAME;
    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void incrementSalary() throws InterruptedException{
        Thread.sleep(2000);
        this.salary *=1.1;
    }
  
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }
 
    // @Override
    // public boolean equals(Object obj) {
    //     Employee other = (Employee) obj;
    //     return other.id == this.id && other.name.equals(this.name);
    // }

    

}
