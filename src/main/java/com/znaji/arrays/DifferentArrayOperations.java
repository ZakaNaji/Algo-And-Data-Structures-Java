package com.znaji.arrays;

import java.util.Arrays;

public class DifferentArrayOperations {

        public static void main(String[] args) {
            int[] arr = new int[] {0,1,0,4,12};
            System.out.println(Arrays.toString(moveAllZerosToTheEnd(arr)));
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

        public static int findSecondMax(int[] arr) {
            int[] max = new int[2];
            max[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max[0]){
                    max[1] = max[0];
                    max[0] = arr[i];
                } else if (arr[i] > max[1] && arr[i] != max[0]) {
                    max[1] = arr[i];
                }
            }
            return max[1];
        }

        public static int[] moveAllZerosToTheEnd(int[] arr) {
            int length = arr.length;
            int[] newArr = new int[length];
            int numberOfZeros = 0;
            for (int i=0; i <length; i++) {
                if (arr[i] == 0) {
                    numberOfZeros++;
                    continue;
                }
                newArr[i - numberOfZeros] = arr[i];
            }
            return newArr;
        }
}
