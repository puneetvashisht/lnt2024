package com.lnt.spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    B b;

    public void execute(){
        b.execute();
        System.out.println("Execute in A..");
    }
    
}
