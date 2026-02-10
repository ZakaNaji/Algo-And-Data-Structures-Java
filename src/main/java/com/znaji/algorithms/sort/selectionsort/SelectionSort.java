package com.znaji.algorithms.sort.selectionsort;

import java.util.Arrays;

import static com.znaji.algorithms.sort.Utils.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arrayToSort = {20, 35,7,2, -15, 7, 55, 1, -22};

        selectionSort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minValIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minValIndex] > array[j]) {
                    minValIndex = j;
                }
            }
            if (minValIndex != i) {
                swap(array, minValIndex, i);
            }
        }
    }

}
