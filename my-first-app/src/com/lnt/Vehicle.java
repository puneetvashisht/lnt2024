package com.lnt;

public class Vehicle extends Object {
    int maxSpeed;
    String color;
    // int wheels;

    public Vehicle(){
        
    }
    public Vehicle(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    // public void start(){
    //     System.out.println("Vehicle starting...");
    // }

    @Override
    public String toString() {
        return "Vehicle [maxSpeed=" + maxSpeed + ", color=" + color + "]";
    }


    
}
