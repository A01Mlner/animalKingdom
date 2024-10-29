package com.lbg.classes;

public abstract class Animal {

    private double weight,height,topSpeed;
    private int age;

    private ReproductionMethod reproductionMethod;

    private Habitat[] habitat;
    private Continent[] continent;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String animalName;


    public Continent[] getContinent() {
        return continent;
    }

    public void setContinent(Continent[] continent) {
        this.continent = continent;
    }

    public abstract void moveAnimal();

    public abstract void makeNoise();



    public Animal() {
        this.weight = 1;
        this.height = 1;
        this.topSpeed = 1;
        this.age = 0;
        this.reproductionMethod = ReproductionMethod.UNKNOWN;
        this.habitat = new Habitat[]{Habitat.UNKNOWN};
        this.continent = new Continent[]{Continent.UNKNOWN};
        this.animalName = "Unknown";
    }


    public static void main(String[] args) {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ReproductionMethod getReproductionMethod() {
        return reproductionMethod;
    }

    public void setReproductionMethod(ReproductionMethod reproductionMethod) {
        this.reproductionMethod = reproductionMethod;
    }

    public Habitat[] getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat[] habitat) {
        this.habitat = habitat;
    }


}
