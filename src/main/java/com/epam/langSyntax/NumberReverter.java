package com.epam.langSyntax;

public class NumberReverter {

    public static int revert(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
