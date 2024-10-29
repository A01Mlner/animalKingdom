package com.lbg.classes;

public class AquaticAnimals extends Animal {
    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public AquaticAnimals(int numberOfFins, int numberOfGils) {
        this.numberOfFins = numberOfFins;
        this.numberOfGils = numberOfGils;
    }

    private int numberOfFins;

    public int getNumberOfGils() {
        return numberOfGils;
    }

    public void setNumberOfGils(int numberOfGils) {
        this.numberOfGils = numberOfGils;
    }

    public AquaticAnimals() {
        this(4, 2);
    }

    private int numberOfGils;

    @Override
    public void moveAnimal() {
        System.out.println("Animal is swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("Splash splash splash");
    }

}
