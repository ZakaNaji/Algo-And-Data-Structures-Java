package com.znaji.datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HTLeetCodeChallenges {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, int[]> map = new HashMap<>();
        int[] results = new int[2];
        for (int num : nums1) {
            map.putIfAbsent(num, new int[2]);
            map.get(num)[0]++;
        }

        for (int num : nums2) {
            map.putIfAbsent(num, new int[2]);
            map.get(num)[1]++;
        }

        for (int[] value : map.values()) {
            if (value[0] > 0 && value[1] > 0) {
                results[0] += value[0];
                results[1] += value[1];
            }
        }
        return results;
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Integer val = map.get(c);
                if (val > 0) {
                    val *= -1;
                    map.put(c, val);
                }
            } else {
                map.put(c, i+1);
            }
        }
        Optional<Integer> first = map.values().stream()
                .filter(v -> v >= 0)
                .sorted()
                .findFirst();
        return first.map(integer -> integer - 1).orElse(-1);
    }

    public static void main(String[] args) {
        HTLeetCodeChallenges htLeetCodeChallenges = new HTLeetCodeChallenges();
        int[] intersectionValues = htLeetCodeChallenges.findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2});
        System.out.println(intersectionValues[0] + " " + intersectionValues[1]);
    }
}
