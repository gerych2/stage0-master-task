package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void swap(int first, int second) {

        first = first ^ second;
        second = second ^ first;
        first = first ^ second;
        System.out.println(first + " " + second);
    }

}