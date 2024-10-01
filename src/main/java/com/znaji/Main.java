package com.znaji;

import com.znaji.arrays.ArrayStringFunctions;
import com.znaji.arrays.DifferentArrayOperations;
import com.znaji.arrays.MyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr2 = new int[] {0,3,4,31};
        int[] arr1 = new int[] {4,6,30};
        System.out.println(Arrays.toString(DifferentArrayOperations.mergeSortedArrays(arr1, arr2)));
    }
}