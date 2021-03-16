package org.functionalrunner2;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        startTime = System.currentTimeMillis();
        List<Integer> numbers = List.of(12, 13, 4, 6, 2);
        long sum = addListStructured(numbers);
        System.out.println("Sum::  " + sum);
        endTime = System.currentTimeMillis();

        System.out.println("Time took " + (endTime - startTime));
    }

    private static long addListStructured(List<Integer> numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

}
