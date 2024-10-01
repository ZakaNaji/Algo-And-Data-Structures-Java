package com.znaji.arrays;

import java.util.Arrays;

public class DifferentArrayOperations {

        public static void main(String[] args) {
            int[] arr = new int[] {1,3,2,5,4,8,6};
            System.out.println(findMissingNumber(arr));
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

        public static void moveAllZerosToTheEnd(int[] arr) {
            int zeroIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] !=0 && arr[zeroIndex] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[zeroIndex];
                    arr[zeroIndex] = temp;
                }
                if(arr[zeroIndex] != 0) {
                    zeroIndex++;
                }
            }
        }

        //suppose we have an array of (n-1) distinct element, find the missing element, knowing the range is from 1-n
        public static int findMissingNumber(int[] arr) {
            //will use the mathematical formula 1+2+...+n = n*(n+1)/2
            int sum = 0;
            int n = arr.length + 1;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return (n*(n+1)/2) - sum;
        }

        public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
            int[] mergedArray = new int[arr1.length + arr2.length];
            int i1 = 0;
            int i2 = 0;
            for (int j = 0; j < mergedArray.length; j++) {
                if (i1 != arr1.length && (i2 == arr2.length || arr1[i1] < arr2[i2])) {
                    mergedArray[j] = arr1[i1];
                    i1++;
                } else {
                    mergedArray[j] = arr2[i2];
                    i2++;
                }
            }
            return mergedArray;
        }
}
