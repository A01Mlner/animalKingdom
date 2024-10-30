package com.lbg.classes;

public class LandMammal extends LandAnimal implements ILiveBirthAble,IEatAble{



    public LandMammal(int numberOfLegs, boolean swim, boolean wings, String sound) {
        super(numberOfLegs, swim, wings);
        this.sound = sound.toLowerCase(); // Convert sound to lowercase
    }

    public LandMammal(String sound) {
        super(4, true, false);
        this.sound = sound.toLowerCase(); // Convert sound to lowercase
    }


    private String sound;

    @Override
    public void moveAnimal() {
        System.out.println("Animal is running");

    }

    @Override
    public void makeNoise() {
        StringBuilder sb = new StringBuilder();
        sb.append(capitalize(sound)).append(" ").append(sound).append(" ").append(sound);
        System.out.println(sb);
    }

    private static String capitalize(String input) {
        // Check if the input is empty
        if (input == null || input.length() == 0) {
            return input;
        }

        // Use StringBuilder for modification
        StringBuilder sb = new StringBuilder(input);

        // Convert the first character to uppercase
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        // Return the result as a String
        return sb.toString();
    }

    @Override
    public void getEaten() {
        System.out.println(this.getAnimalName()+" tries to run away");
        StringBuilder sb = new StringBuilder();
        sb.append(capitalize(sound)).append(" ").append(sound).append(" ......");
        System.out.println(sb);
        System.out.println(this.getAnimalName()+" was caught... oh no! I am getting eaten.");
    }
}
