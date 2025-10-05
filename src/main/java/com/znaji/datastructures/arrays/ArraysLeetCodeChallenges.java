package com.znaji.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysLeetCodeChallenges {

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        if (mountain.length < 3) {
            return peaks;
        }
        int before, after, current;
        for (int i = 1; i < mountain.length-1; i++) {
            before = mountain[i-1];
            after = mountain[i+1];
            current = mountain[i];
            if (current > before && current > after) {
                peaks.add(i);
            }
        }
        return peaks;
    }

    public int findPeakElement(int[] nums) {
        return findPeakRec(nums, 0, nums.length - 1);
    }

    private int findPeakRec(int[] nums, int low, int high) {
        if (low == high) return low;
        int mid = low + (high - low)/2;
        if (nums[mid] > nums[mid+1]) {
            return findPeakRec(nums, low, mid);
        } else {
            return findPeakRec(nums, mid+1, high);
        }
    }

    public static void main(String[] args) {
        ArraysLeetCodeChallenges arraysLeetCodeChallenges = new ArraysLeetCodeChallenges();
        int peakPosition = arraysLeetCodeChallenges.findPeakElement(new int[]{1,2,3,1});
        System.out.println(peakPosition);
    }
}
