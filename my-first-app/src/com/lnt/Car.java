package com.lnt;

public class Car extends Vehicle{
    boolean isAutomatic;
    

    public Car(int maxSpeed, String color, boolean isAutomatic) {
        super(maxSpeed, color);
        // this.maxSpeed = maxSpeed;
        // this.color = color;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Car [maxSpeed=" + maxSpeed + ", isAutomatic=" + isAutomatic + ", color=" + color + "]";
    }
    // @Override
    public void start(){
        System.out.println("Car starting...");
    }
    
}
