package com.znaji.algorithms.sort.insertionsort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int [] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        shellSort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void shellSort(int[] arrayToSort) {
        long start = System.nanoTime();
        for (int gap = arrayToSort.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrayToSort.length; i++) {
                int insertedlEment = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j-gap] > insertedlEment) {
                    arrayToSort[j] = arrayToSort[j-gap];
                    j -= gap;
                }
                arrayToSort[j] = insertedlEment;
            }
        }
        long end = System.nanoTime();
        System.out.println("Shell sort took: " + (end - start));
    }

    public static void insertionSort(int array[]) {
        long start = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int insertedElement = array[i];
            int j = i;

            while (j >0 && array[j-1] > insertedElement) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = insertedElement;
        }
        long end = System.nanoTime();
        System.out.println("Insertion sort took: " + (end - start));

    }
}
