package com.znaji.arrays;

import java.util.*;

public class ArrayHasPairWithSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            } else {
                map.put(complement, i);
            }
        }
        throw new IllegalArgumentException("no sum found");
    }

    public static void main(String[] args) {
        final int[] arr = new int[] {1,2,3,5};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
        int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(twoSum(arr2, 19)));
    }
}
