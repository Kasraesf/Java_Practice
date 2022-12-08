package org.example;

import java.util.Arrays;

public class GenericInsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T current = array[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] array = {5, 4, 3, 2, 1};

        // Sort the array using the insertionSort() function
        insertionSort(array);

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }

}
