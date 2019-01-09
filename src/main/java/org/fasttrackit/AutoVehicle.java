package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    Engine engine;
    boolean running;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle(){
        this(new Engine());
    }

    //constructor overloading
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
