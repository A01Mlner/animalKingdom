package com.lbg.classes;

public class FlyingInsect extends Flying implements IEatAble{
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

    @Override
    public void getEaten() {
        System.out.println(this.getAnimalName()+" tries to fly away");
        System.out.println("Buzz buzz ......");
        System.out.println(this.getAnimalName()+" was caught... oh no! I am getting eaten.");

    }
}
