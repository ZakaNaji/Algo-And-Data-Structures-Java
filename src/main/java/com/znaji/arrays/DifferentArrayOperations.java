package com.znaji.arrays;

public class DifferentArrayOperations {

        public static void main(String[] args) {
            int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
            printArray(arr);
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Array element at index " + i + ": " + arr[i]);
            }
        }
}
