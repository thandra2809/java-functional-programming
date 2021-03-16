package org.functionalrunner;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        startTime = System.currentTimeMillis();
        List<Integer> numbers = List.of(12, 13, 4, 6, 2);
        printEvenNumbersInListStructured(numbers);
        endTime = System.currentTimeMillis();

        System.out.println("Time took " + (endTime - startTime));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("number = " + number);
            }
        }
    }
}
