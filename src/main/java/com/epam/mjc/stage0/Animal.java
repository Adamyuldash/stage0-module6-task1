package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paws;
        if (numberOfPaws == 1) {
            paws = "paw";
        } else {
            paws = "paws";
        }
        return String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, paws, hasFur ? "a" : "no");
    }

}
