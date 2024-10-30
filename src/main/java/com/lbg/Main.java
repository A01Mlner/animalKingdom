package com.lbg;
import com.lbg.classes.*;

public class Main {

    public static void main(String[] args) {

        Animal adamsDog = new LandMammal("woof");

        Animal nevasFish = new AquaticAnimals();


        Animal hamzasCat = new LandMammal("meow");
        hamzasCat.setAnimalName("Bami");

        FlyingInsect victoriasFly = new FlyingInsect(4, 0.02, 2.0);
        victoriasFly.setAnimalName("Buzzy");

        Animal otherAdamsBird = new Flying(2, 1, 200);

        FlyingMammal mattsBat = new FlyingMammal(2,0.5,12);
        mattsBat.setAnimalName("Flying Witch");

        LandMammal vickiMouse = new LandMammal(4,true , false, "Squeak");
        vickiMouse.setAnimalName("Vicki 2.0");

        IEatAble[] toBeEaten = {mattsBat,vickiMouse,victoriasFly};
        ILiveBirthAble[] toGiveBirth = {mattsBat,vickiMouse};

        Animal[] our_animal = {adamsDog, nevasFish, hamzasCat, victoriasFly, otherAdamsBird};

        for (Animal animal : our_animal) {animal.makeNoise();
            animal.moveAnimal();}

        for (ILiveBirthAble mum:toGiveBirth){
                mum.giveBirth(2,(Animal)mum);

        }

        for(IEatAble eated:toBeEaten){
            eated.getEaten();
        }

    }
}