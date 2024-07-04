package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("red", 2, true);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly red. " +
                "It has 2 paws and has fur. Moreover, " +
                "it has 2 wings and can fly.";
    }
}