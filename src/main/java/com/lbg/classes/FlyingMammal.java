package com.lbg.classes;

public class FlyingMammal extends Flying implements IEatAble,ILiveBirthAble{
    public FlyingMammal(int numOfWings, double wingspan, double maxFlightDistance) {
        super(numOfWings,wingspan,maxFlightDistance);
    }
    public FlyingMammal(){
        super();
    }
    @Override
    public void getEaten() {
        System.out.println(this.getAnimalName()+" tries to fly away");
        System.out.println("Flap flap ......");
        System.out.println(this.getAnimalName()+" was caught... oh no! I am getting eaten.");

    }

}
