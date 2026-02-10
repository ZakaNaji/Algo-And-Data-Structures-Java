package com.znaji.algorithms.sort.bubblesort;

import java.util.Arrays;

public class SimpleBubbleSort {

    public static void main(String[] args) {
        int [] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        for (int i = arrayToSort.length - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[j+1]) swap(arrayToSort, j, j+1);
            }
        }

        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void swap(int[] array, int pos1, int pos2) {
        if (pos1 == pos2) return;
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}


