package com.znaji.datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        int [] array1 = new int[] {1,2,3};
        int [] array2 = new int[] {3,4,6};

        System.out.println(itemsInCommon(array1, array2));

    }

    public static boolean itemsInCommon(int [] array1, int [] array2) {
        HashTable hashTable = new HashTable();
        for (int i : array1) {
            hashTable.set(String.valueOf(i), i);
        }
        for (int i : array2) {
            if (hashTable.get(String.valueOf(i)) != null) return true;
        }
        return false;
    }
}
