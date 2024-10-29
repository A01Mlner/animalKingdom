package com.lbg.classes;

public abstract class LandAnimal extends Animal {
    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    private boolean wings, swim;

    public LandAnimal(int numberOfLegs, boolean swim, boolean wings) {
        this.numberOfLegs = numberOfLegs;
        this.swim = swim;
        this.wings = wings;
    }

    private final int numberOfLegs;

//    @Override
//    abstract public void moveAnimal();

//    @Override
//    abstract public void makeNoise();
}
