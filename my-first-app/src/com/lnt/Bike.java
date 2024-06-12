package com.lnt;

public class Bike extends Vehicle {
    boolean selfBalancing;
    String stand;
    public Bike(int maxSpeed, String color, boolean selfBalancing, String stand) {
        super(maxSpeed, color);
        this.selfBalancing = selfBalancing;
        this.stand = stand;
    }
    @Override
    public String toString() {
        return "Bike [maxSpeed=" + maxSpeed + ", selfBalancing=" + selfBalancing + ", color=" + color + ", stand="
                + stand + "]";
    }
    // @Override
    public void start(){
        System.out.println("Bike starting...");
    }


    
}
