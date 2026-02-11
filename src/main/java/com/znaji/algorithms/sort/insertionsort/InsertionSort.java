package com.znaji.algorithms.sort.insertionsort;

import java.util.Arrays;

import static com.znaji.algorithms.sort.Utils.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void insertionSort(int [] array) {
        for (int i = 1; i < array.length; i++) {
            int unsortedIndex = i;
            for (int j = i-1; j >=0; j--) {
                if (array[j] <= array[unsortedIndex]) {
                    break;
                }
                swap(array, unsortedIndex, j);
                unsortedIndex = j;
            }
        }
    }
}
