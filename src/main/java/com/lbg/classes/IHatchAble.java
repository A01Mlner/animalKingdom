package com.lbg.classes;

public interface IHatchAble {

    default void layEggs(int numOfEggs){
        System.out.println("Animal laid "+numOfEggs+" eggs");
    }

    default void eggHatch(){
        System.out.println("Animal egg Hatched!!!!");
    }
}
