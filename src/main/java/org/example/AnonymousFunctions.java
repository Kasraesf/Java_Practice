package org.example;

import java.util.function.Function;

public class AnonymousFunctions {
    public static void main(String[] args) {
        // Create an anonymous function that takes a string and returns a new string
        // with the first and last characters removed
        Function<String, String> removeFirstAndLast = new Function<String, String>() {
            public String apply(String s) {
                return s.substring(1, s.length() - 1);
            }
        };

        // Create an anonymous function that takes a string and returns a new string
        // with all vowels removed
        Function<String, String> removeVowels = new Function<String, String>() {
            public String apply(String s) {
                return s.replaceAll("[aeiou]", "");
            }
        };

        // Create an anonymous function that takes a string and applies the two
        // functions above in sequence
        Function<String, String> transformString = s -> removeFirstAndLast.apply(removeVowels.apply(s));

        // Use the anonymous function to transform a string
        String result = transformString.apply("Hello, world!");
        System.out.println("The transformed string is: " + result);
    }
}
