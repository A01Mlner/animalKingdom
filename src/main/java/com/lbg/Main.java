package com.lbg;
import com.lbg.classes.*;

public class Main {

    public static void main(String[] args) {

        Animal adamsDog = new LandMammal("woof");

        Animal nevasFish = new AquaticAnimals();

        Animal hamzasCat = new LandMammal("meow");

        Animal victoriasFly = new FlyingInsect(4, 0.02, 2.0);

        Animal otherAdamsBird = new Flying(2, 1, 200);

        Animal[] our_animal = {adamsDog, nevasFish, hamzasCat, victoriasFly, otherAdamsBird};

        for (Animal animal : our_animal) {animal.makeNoise();
        animal.moveAnimal();}

    }
}