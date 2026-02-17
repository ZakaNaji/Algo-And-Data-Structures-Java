package com.znaji.algorithms.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        insertionSort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void insertionSort(int [] array) {
        for (int i = 1; i < array.length; i++) {
            int inserted = array[i];
            int j = i;
            while (j>0 && array[j-1] > inserted) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = inserted;
        }
    }
}
