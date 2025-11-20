package com.znaji.datastructures.hashtable;

import java.util.*;

public class GroupAnagrams {
    private List<List<String>> results = new ArrayList<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapOfAnagrams = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            mapOfAnagrams.computeIfAbsent(sorted, _ -> {
                        List<String> list = new ArrayList<>();
                        results.add(list);
                        return list;
                    })
                    .add(s);
        }
        return results;
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat","tab"};
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
