package com.znaji.algorithms.sort.bubblesort;

import java.util.Arrays;

import static com.znaji.algorithms.sort.Utils.swap;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arrayToSort = {20, 35, -15, 7, 55, 1, -22};

        bubbleSort(arrayToSort);

        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void bubbleSort(int[] arrayToSort) {
        for (int i = arrayToSort.length - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[j+1]) swap(arrayToSort, j, j+1);
            }
        }
    }


}


