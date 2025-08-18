package com.znaji.datastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayLetCodeExercices arrayLetCodeExercices = new ArrayLetCodeExercices();
        int [] nums = {0,1,2,3};
        arrayLetCodeExercices.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
