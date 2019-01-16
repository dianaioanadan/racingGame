package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumberOfVehicles;

    private String name;
    private String colour;
    private double mileage;
    private long totalKm;
    private double fuelLevel = 70;

    public double accelerate (double speed, double durationInHours){
        System.out.println(name + " accelerate with " + speed + " Km/h " + durationInHours  + " hours");

        double distance = speed * durationInHours;
        System.out.println("Travel distance " + distance);

        double spentFuel = distance * mileage / 100;

        // same as: fuelLevel = fuelLevel - spentFuel;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

        // same as: totalKm = totalKm + distance;
        totalKm += distance;
        System.out.println("Total travel distance: " + totalKm);

        return distance;
    };

    //method overloading
    public double accelerate (double speed){

        return accelerate(speed,1);
    }
    //method used just  to demonstrate co-varinat return types
    public Vehicle returnSomeVehicle(){
        return this;
    }

    public Vehicle() {
        applicationTotalNumberOfVehicles++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
