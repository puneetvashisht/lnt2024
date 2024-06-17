package com.deps;

public class A {

    B b;

    public A(B b) {
        this.b = b;
    }
    public A(){
        b = new B();
    }

    public void execute(){
        b.execute();
        System.out.println("Execute in A..");
    }
    
    
}
