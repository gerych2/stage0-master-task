package com.epam.loops;

public class Pyramid {

    public static void printPyramid(int cathetusLength) {
        if (cathetusLength < 1) {
            throw new IllegalArgumentException("Cathetus length must be a positive integer");
        }

        for (int row = 1; row <= cathetusLength; row++) {
            printSpaces(cathetusLength - row);
            printNumbers(row);
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printNumbers(int row) {
        for (int i = -row + 1; i <= row - 1; i++) {
            System.out.print(Math.abs(i));
        }
    }

    public static void main(String[] args) {
        printPyramid(7);
    }
}
