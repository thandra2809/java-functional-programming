package org.functionalrunner2;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        startTime = System.currentTimeMillis();
        List<Integer> numbers = List.of(12, 13, 4, 6, 2);
        int sum = addListFunctional(numbers);
        System.out.println("Sum::  " + sum);
        endTime = System.currentTimeMillis();

        System.out.println("Time took " + (endTime - startTime));
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    private static int sum(Integer a, Integer b) {
        return a + b;
    }
}
