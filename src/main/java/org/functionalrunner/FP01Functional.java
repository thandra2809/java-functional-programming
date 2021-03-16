package org.functionalrunner;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        long startTime=0L;
        long endTime=0L;
        startTime = System.currentTimeMillis();
        printAllNumbersInListFunctional(List.of(12, 13, 4, 6, 2));
        endTime = System.currentTimeMillis();

        System.out.println("Time took " + (endTime-startTime));
    }

    private static void print(int number) {
        System.out.println("number = " + number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
/*        for (int number : numbers) {
            System.out.println("number = " + number);
        }*/
        numbers.stream().forEach(FP01Functional::print);

    }
}
