package com.lbg.classes;

public class FlyingInsect extends Flying{
    private final int numOfLegs=6;

    public FlyingInsect(int numOfWings, double wingspan, double maxFlightDistance) {
        super(numOfWings, wingspan, maxFlightDistance);
    }

    public FlyingInsect()
    {
        super();
    }


    @Override
    public void makeNoise() {
        System.out.println("Buzz buzz buzz");

    }
}
