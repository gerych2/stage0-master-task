package com.epam.loops;

public class MultiplicationTable {

    public static void printTable(int numberTableToPrint) {
        if (numberTableToPrint < 1 || numberTableToPrint > 10) {
            throw new IllegalArgumentException("Invalid number: " + numberTableToPrint);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, numberTableToPrint, i * numberTableToPrint);
        }
    }

    public static void main(String[] args) {
        printTable(8);
    }
}
