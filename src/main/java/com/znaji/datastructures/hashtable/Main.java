package com.znaji.datastructures.hashtable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String hello = "a@2ab@2b!";

        System.out.println(firstNonRepeatingChar(hello));

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

    public static List<Integer> findDuplicates(int [] array) {
        HashTable hashTable = new HashTable();
        Set<Integer> duplicates = new HashSet<>();

        for (int value : array) {
            if (hashTable.get(String.valueOf(value)) != null) {
                duplicates.add(value);
            } else {
                hashTable.set(String.valueOf(value), value);
            }
        }
        return duplicates.stream().toList();
    }

    public static List<Integer> findDuplicates2(int array[]) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int value : array) {
            values.put(value, values.getOrDefault(value, 0) + 1);
        }
        final List<Integer> duplicates = new ArrayList<>();
        values.forEach((key, value) -> {
            if (value > 1) {
                duplicates.add(key);
            }
        });
        return duplicates;
    }

    public static Character firstNonRepeatingChar(String text) {
        Map<Character, Integer> nonDuplicates = new HashMap();
        for (Character c : text.toCharArray()) {
            nonDuplicates.put(c, nonDuplicates.getOrDefault(c, 0) + 1);
        }
        for (Character c : text.toCharArray()) {
            if (nonDuplicates.get(c) == 1) return c;
        }
        return null;
    }
}
