package org.example;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9, 6};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
