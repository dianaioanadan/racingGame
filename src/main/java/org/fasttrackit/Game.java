package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[10];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        addCompetitors(2);
        displayCompetitors();
        addTrack(0, new Track("Highway", 300));
        addTrack(1, new Track("Seaside", 100));
        displayAvailableTracks();

        int trackOrder = getTruckNoFromUser();
        Track track = tracks[trackOrder-1];

        System.out.println("Chosen track is: "+track.getName());


    }

    public void addCompetitors(int competitorCount) {

        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
            String name = getVehicleNameFromUser();
            vehicle.setName(name);
            double mileage = ThreadLocalRandom.current().nextDouble(5, 15);
            vehicle.setMileage(mileage);
            System.out.println("Your milage is: " + mileage);
            //vehicle details will be populated when we learn to get user's input
            competitors.add(vehicle);
        }
    }

    public void displayCompetitors() {
        System.out.println("Welcome! Race is starting with: ");
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName());
            }
        }
        /*
enhanced for with lists (same as with arrays)
for (Vehicle vehicle:competitors){
System.out.println(vehicle.getName());
*/
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is: " + name);
        return name;
    }

    private double getVehicleAccelerationFromUser() {
        System.out.println("Please enter acceleration speed as a decimal no");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }

    private int getTruckNoFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Track: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException exception){
            //throw new Exception("Expected an integer number.");
            System.out.println("Expected an integer number between 1 and 2.");
            return getTruckNoFromUser();
        }
    }


    public void addTrack(int index, Track track) {
        //tracks[0] = new Track("Highway", 300);
        tracks[index] = track;
    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks: ");

        //(clasic) for loop
//        for (int i = 0; i < tracks.length; i++) {
////            if (tracks[i] != null) {
////                System.out.println(tracks[i].getName());
////            }
////        }

        // enhanced for loop (for-each)
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
                System.out.println(track.getLength());
            }
        }
    }
}
