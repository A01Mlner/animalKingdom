package com.lbg.classes;

public class Flying extends Animal{

    private int numOfWings;
    private double wingspan;

    private double maxFlightDistance;

    public Flying(int numOfWings, double wingspan, double maxFlightDistance) {
        this.numOfWings = numOfWings;
        this.wingspan = wingspan;
        this.maxFlightDistance = maxFlightDistance;
    }

    public Flying() {
        this(2, 1.0, 1);
    }


    @Override
    public void moveAnimal() {
        System.out.println("Animal is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Flap flap flap");

    }

    public int getNumOfWings() {
        return numOfWings;
    }

    public void setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public void setMaxFlightDistance(double maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }
}
