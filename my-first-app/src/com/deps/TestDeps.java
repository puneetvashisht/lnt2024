package com.deps;

public class TestDeps {
    public static void main(String[] args) {
        B b = new B();

        A a = new A(b);
        a.execute();
    }
}
