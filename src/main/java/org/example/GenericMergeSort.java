package org.example;

import java.util.Arrays;

public class GenericMergeSort {
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array.length <= 1) return;

        int middle = array.length / 2;

        T[] left = Arrays.copyOfRange(array, 0, middle);
        T[] right = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static <T extends Comparable<T>> void merge(T[] array, T[] left, T[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                array[arrayIndex] = left[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = right[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        while (leftIndex < left.length) {
            array[arrayIndex] = left[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

        while (rightIndex < right.length) {
            array[arrayIndex] = right[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] array = {5, 4, 3, 2, 1};

        // Sort the array using the mergeSort() function
        mergeSort(array);

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }

}
