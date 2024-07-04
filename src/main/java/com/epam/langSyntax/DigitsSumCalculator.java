package com.epam.langSyntax;

public class DigitsSumCalculator {

    public static int calculateSum(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
