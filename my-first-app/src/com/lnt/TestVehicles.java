package com.lnt;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(222, "red");
        System.out.println(v);

        Car c = new Car(200, "white", true);
        System.out.println(c);
    }
}
