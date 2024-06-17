package com.lnt.spring_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee(23, "Ravi", 34343.34));
        employees.add(new Employee(2, "Priya", 344343.34));
        employees.add(new Employee(21, "Rahul", 444343.34));
    }
    @RequestMapping(path="/employees", method=RequestMethod.GET)
    public List<Employee> getEmployees(){
        System.out.println("Invoking get employees...");
        return employees;
    }
    @RequestMapping(path="/employees", method=RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){
       employees.add(employee);
    }
    @RequestMapping(path="/employees/{index}", method=RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("index") int index){
        System.out.println("Index recieved: " + index);
        employees.remove(index);
    }
}
