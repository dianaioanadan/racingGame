package org.fasttrackit;

public class Vehicle {
    String name;
    String colour;
    double mileage;
    long totalKm;

    public double accelerate (double speed, double durationInHours){
        System.out.println(name + " accelerate with " + speed + " Km/h " + durationInHours  + " hours");

        double distance = speed * durationInHours;

        System.out.println("Travel distance " + distance);

        return distance;
    };

}
