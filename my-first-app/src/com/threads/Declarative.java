package com.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

// class NameCondition implements Predicate<Employee>{

//     @Override
//     public boolean test(Employee t) {
//        return t.name.startsWith("R");
//     }
    
// }

public class Declarative {

    public static void printEmployee(List<Employee> employees, Predicate<Employee> p){
        for(Employee e : employees){
            // if(e.name.startsWith("R")){
            if(p.test(e))
                System.out.println(e);
            }
        }
    

    public static void main(String[] args) throws InterruptedException {

        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(23, "Ravi", 223232.22);
        employees.add(e1);
        Employee e2 = new Employee(3, "axy", 33333.33);
        employees.add(e2);
        Employee e3 = new Employee(23, "Rahul", 44444.44);
        employees.add(e3);

        Collections.sort(employees, (o1, o2) -> ((int)(o2.salary - o1.salary)));
        System.out.println(employees);
        
        // Comparator
       OptionalDouble maxSalary = employees.stream()
       .filter((f)->f.name.startsWith("R"))
        .mapToDouble((e)-> e.salary)
        .max();

        System.out.println(maxSalary.getAsDouble());
        
        // .filter((e)-> e.name.startsWith("R"))
        // .forEach((d)-> System.out.println(d));

        // System.out.println(employees);

        // for(Employee e : employees){
        //     if(e.name.startsWith("R")){
        //         System.out.println(e);
        //     }
        // }
        Predicate<Employee> p = (e)-> e.name.startsWith("R");
        // printEmployee(employees, p);

        // for(Employee e : employees){
        //     if(e.salary > 30000){
        //         System.out.println(e);
        //     }
        // }
        // printEmployee(employees);
        // printEmployee(employees, (e)-> e.salary > 30000);

        // printEmployee(employees, (e)->true );

    }
}
