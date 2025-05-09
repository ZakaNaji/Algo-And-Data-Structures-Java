package com.znaji.datastructures.hashtable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strings));
    }

    public static boolean itemsInCommon(int[] array1, int[] array2) {
        HashTable hashTable = new HashTable();
        for (int i : array1) {
            hashTable.set(String.valueOf(i), i);
        }
        for (int i : array2) {
            if (hashTable.get(String.valueOf(i)) != null) return true;
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] array) {
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

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strings) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String canonicalStr = new String(charArray);

            anagramsMap.computeIfAbsent(canonicalStr, k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }
    private static boolean isAnagram(String text, String anotherText) {
        Map<Character, Integer> textOccurrences = new HashMap<>();
        for (char c : text.toCharArray()) {
            textOccurrences.put(c, textOccurrences.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> anotherTextOccurrences = new HashMap<>();
        for (char c : anotherText.toCharArray()) {
            anotherTextOccurrences.put(c, anotherTextOccurrences.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : textOccurrences.entrySet()) {
            if (!anotherTextOccurrences.get(entry.getKey()).equals(entry.getValue())) return false;
        }
        return true;
    }
}
