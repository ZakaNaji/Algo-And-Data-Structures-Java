package com.znaji.datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;

public class HTLeetCodeChallenges {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, int[]> map = new HashMap<>();
        int [] results = new int[2];
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

    public static void main(String[] args) {
        HTLeetCodeChallenges htLeetCodeChallenges = new HTLeetCodeChallenges();
        int[] intersectionValues = htLeetCodeChallenges.findIntersectionValues(new int[]{2, 3, 2}, new int[]{1, 2});
        System.out.println(intersectionValues[0] + " " + intersectionValues[1]);
    }
}
