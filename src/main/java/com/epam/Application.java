package com.epam;

import com.epam.OOP.Animal;
import com.epam.OOP.Bird;
import com.epam.OOP.Dog;
import com.epam.algorithms.ArrayTasks;
import com.epam.conditions.*;
import com.epam.langSyntax.DigitsSumCalculator;
import com.epam.langSyntax.NumberReverter;
import com.epam.loops.MultiplicationTable;

public class Application {

    public static void main(String[] args) {
        //Conditions
        SeasonDeterminer.tellTheSeason(8);
        TriangleSidesValidator.validate(3, 4, 5);
        DaysInMonth.printDays(1991, 6);
        IntegerDivider.printCompletelyDivided(20, 3);
        CoordinatePane.printQuadrant(1, -8);
        BitwiseValuesSwap.swap(2, 4);

        //Lang Syntax
        NumberReverter.revert(567);
        DigitsSumCalculator.calculateSum(1337);

        //Loops
        MultiplicationTable.printTable(4);

        //OOP
        Animal animal = new Animal("black", 4, false); // This animal is mostly black. It has 4 paws and no fur.
        Dog dog = new Dog(); // This animal is mostly white. It has 4 paws and fur.
        Bird bird = new Bird(); // This animal is mostly red. It has 2 paws and has fur. Moreover, it has 2 wings and can fly.
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());

    }


}