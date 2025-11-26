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

        System.out.println(subarraySum(new int[] {1,1,1},2));
        System.out.println(subarraySum(new int[] {1,2,3},3));
        System.out.println(subarraySum(new int[] {1,2,1,2,1},3));

    }

    public static int[] subarraySum1(int [] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            int rem = sum - target;
            if (map.containsKey(rem)) {
                return new int[] {map.get(rem) + 1, i};
            }
            map.put(sum, i);
        }
        return new int[2];
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);
        int sum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rest = sum - k;
            if (prefixMap.containsKey(rest)) {
                total += prefixMap.get(rest);
            }
            prefixMap.compute(sum, (key,v) -> (v == null)? 1 : v+1);
        }
        return total;
    }
}
