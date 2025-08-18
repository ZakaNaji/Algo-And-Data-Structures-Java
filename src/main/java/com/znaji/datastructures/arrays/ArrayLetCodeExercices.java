package com.znaji.datastructures.arrays;

public class ArrayLetCodeExercices {
    public void moveZeroes(int[] nums) {
        int size =  nums.length;
        int slow = 0;
        for (int fast = 0; fast < size; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
