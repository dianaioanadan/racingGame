package org.fasttrackit;

import org.fasttrackit.cheater.CheatingCar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        // local variables are variables declared inside a method
//        // they don't receive default values
//        Engine firstEngine = new Engine();
//        firstEngine.manufacturer = "Renault";
//
//        //declare a variable and instantiating a Car object
//        //this is also a called initalizing a variable
//       Car firstCompetitor = new Car(new Engine());
//       firstCompetitor.setName("Dacia");
//       firstCompetitor.setColour("black");
//       firstCompetitor.doorCount = 5;
//       firstCompetitor.setMileage(9.5);
//
//       // sout prints a message to the console
//        System.out.println(firstEngine.manufacturer);
//
//       firstCompetitor.engine.manufacturer = "BMW";
//
//        Car secondCompetitor = new Car(new Engine());
//        secondCompetitor.setName("Golf");
//
//        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstCompetitor.engine.manufacturer);
//
//        double traveledDistance=firstCompetitor.accelerate(100, 3);
//
//        AutoVehicle autoVehicle= new AutoVehicle(new Engine());

        Vehicle cheatingCar = new CheatingCar();
        cheatingCar.accelerate(10, 2);

        //type casting
        ((CheatingCar) cheatingCar).testMethod();

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";

        System.out.println(firstEngine);

        Car firstCompetitor = new Car(new Engine());
        firstCompetitor.setName("Dacia");

        double distanceFirstCar = firstCompetitor.accelerate(70);
        System.out.println("Prima masina accelereaza cu " + distanceFirstCar);

        CheatingCar secondCompetitor = new CheatingCar();
        secondCompetitor.setName("Test1");

        double distanceSecondCar = secondCompetitor.accelerate(70);
        System.out.println("A doua masina accelereaza cu " + distanceSecondCar);



//        Vehicle vehicle = new Vehicle();
//        Vehicle.applicationTotalNumberOfVehicles =1;
//
//        System.out.println("Total from vehicle 1 +" + vehicle.applicationTotalNumberOfVehicles);
//
//        Vehicle vehicle2 = new Vehicle();
//        Vehicle.applicationTotalNumberOfVehicles =2;
//
//        System.out.println("Total from vehicle 2 +" + Vehicle.applicationTotalNumberOfVehicles);
//        System.out.println("Total from vehicle 1 +" + Vehicle.applicationTotalNumberOfVehicles);
    }
}
