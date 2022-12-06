package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        //Map - Multiply each number by 2
        List<Integer> multipliedNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());
        System.out.println("Multiplied numbers: " + multipliedNumbers);

        //Reduce - Sum all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
