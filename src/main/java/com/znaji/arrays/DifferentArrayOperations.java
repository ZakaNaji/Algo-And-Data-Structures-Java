package com.znaji.arrays;

public class DifferentArrayOperations {

        public static void main(String[] args) {
            int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
            System.out.println(findMax(arr));
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Array element at index " + i + ": " + arr[i]);
            }
        }

        public static int[] removeEvenNumbers(int[] arr) {
            int oddCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    oddCount++;
                }
            }
            int[] oddArr = new int[oddCount];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    oddArr[j] = arr[i];
                    j++;
                }
            }
            return oddArr;
        }

        public static void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static int findMax(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
}
