package org.functionalrunner;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        startTime = System.currentTimeMillis();
        List<Integer> numbers = List.of(12, 13, 4, 6, 7, 2);
        printSquaresOfEvenNumbersInListFunctional(numbers);
        endTime = System.currentTimeMillis();

        System.out.println("Time took " + (endTime - startTime));
    }

    private static void print(int number) {
        System.out.println("number = " + number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().forEach(System.out::println);

    }


    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().
                filter(FP01Functional::isEven).
                forEach(System.out::println);

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream().
                filter(FP01Functional::isEven).
                map(number -> number * number).
                forEach(System.out::println);

    }
}
