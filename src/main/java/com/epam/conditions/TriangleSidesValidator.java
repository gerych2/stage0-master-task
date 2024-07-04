package com.epam.conditions;

public class TriangleSidesValidator {

    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (isValidTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
