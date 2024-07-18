package com.example;

import java.util.Arrays;

public class ArrayLeftShift {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        leftShift(nums);
        
        System.out.println("Array after left shift: " + Arrays.toString(nums));
    }

    private static void leftShift(int[] nums) {
        if (nums.length == 0) return; // handle edge case of empty array
        
        int first = nums[0]; // store the first element
        
        // shift elements to the left
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        
        // place the first element at the last position
        nums[nums.length - 1] = first;
    }
}
