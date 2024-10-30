package com.lbg.classes;

public interface ILiveBirthAble {
    default void giveBirth(int numberOfBabies,Animal thisAnimal){
        System.out.println(thisAnimal.animalName+" gave live birth to "+numberOfBabies+" babies");
    }


}
