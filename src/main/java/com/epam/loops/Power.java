package com.epam.loops;

public class Power {

    public static int calculatePower(int number, int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Power cannot be negative");
        }

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = calculatePower(10, 3);
        System.out.println(result);
    }
}
