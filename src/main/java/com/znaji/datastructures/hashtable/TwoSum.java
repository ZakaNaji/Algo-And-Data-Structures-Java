package com.znaji.datastructures.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (sums.containsKey(nums[i])) {
                return new int[] {sums.get(nums[i]), i};
            }
            sums.put(target - nums[i],i);
        }
        return new int[2];
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,3}, 6)));
    }
}
