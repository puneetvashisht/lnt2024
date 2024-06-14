package com.threads;

import java.util.LinkedList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        List<Employee> employees = new LinkedList<>();
        Employee e1 = new Employee(23, "abc", 223232.22);
        employees.add(e1);
        Employee e2 = new Employee(3, "axy", 33333.33);
        employees.add(e2);
        Employee e3 = new Employee(23, "abcd", 44444.44);
        employees.add(e3);

        System.out.println(employees);

        long startTime = System.currentTimeMillis();
        for(Employee e : employees){
            // e.incrementSalary();
            IncrementTask task = new IncrementTask(e);
            Thread t = new Thread(task);
            t.start();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" Total time taken : " + (endTime-startTime));

        for(int i=0;i<10;i++){
        Runnable runnable = () -> System.out.println("run by" + Thread.currentThread().getName());
        Thread t = new Thread(runnable);
        t.start();
        }
        System.out.println("allz is well! run by " +
        Thread.currentThread().getName());

    }
}
