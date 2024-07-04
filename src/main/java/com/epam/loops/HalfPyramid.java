package com.epam.loops;

public class HalfPyramid {

    public static void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            printSpaces(cathetusLength - i);
            printStars(i);
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        printHalfPyramid(8);
    }
}
