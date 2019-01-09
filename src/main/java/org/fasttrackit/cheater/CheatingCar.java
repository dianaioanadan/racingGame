package org.fasttrackit.cheater;

import org.fasttrackit.AutoVehicle;
import org.fasttrackit.Vehicle;

    public class CheatingCar extends Vehicle {


        //Co-variant return types
        @Override
        public AutoVehicle returnSomeVehicle() {
            return new AutoVehicle();
        }

        public double accelerate (double speed, double durationInHours) {
            // double cheatingSpeed = 2*speed
            // return super.accelerate(cheatingSpeed,durationInHours)

            System.out.println(getName() + " accelerate with " + speed + " Km/h " + durationInHours + " hours");

            double distance = 2 * speed * durationInHours;
            System.out.println("Travel distance " + distance);

            return distance;
        }

            //method used to demonstrate type casting
            public void testMethod(){
                System.out.println("Mesaj de test");
            }

        }

