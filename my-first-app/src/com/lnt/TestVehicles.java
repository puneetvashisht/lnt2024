package com.lnt;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(222, "red");
        System.out.println(v);

        Car c = new Car(200, "white", true);
        System.out.println(c);

        Bike b = new Bike(130, "Blue", true, "Side stand");
        System.out.println(b);

        int i = 34;
        // upcasting - smaller value into larger container
        long j = i;
        //downcasting - bigger value into smaller container
        byte b1 = (byte)i;

        // upcasting with references
        Vehicle vehicles[] = {v, c, b};
        // System.out.println(v1);

        for(Vehicle vehicle: vehicles){
            // vehicle.start();
            System.out.println(vehicle);
        }

        // downcasting
        // Car c1 = (Car)v;

    }
}
