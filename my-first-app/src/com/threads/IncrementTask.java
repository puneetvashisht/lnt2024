package com.threads;

public class IncrementTask implements Runnable {
    Employee employee;

    public IncrementTask(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
        // code for increment salary
        synchronized(Employee.class){
            Employee.COMPANY_NAME = "ABC Corp.";
        }
 
        try {
            employee.incrementSalary();
            System.out.println(employee);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
