package blind75;

import java.util.Arrays;

public class ArrayRightShift {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        rightShift(nums);
        
        System.out.println("Array after right shift: " + Arrays.toString(nums));
    }

    private static void rightShift(int[] nums) {
        if (nums.length == 0) return; // handle edge case of empty array
        
        int last = nums[nums.length - 1]; // store the last element
        
        // shift elements to the right
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        
        // place the last element at the first position
        nums[0] = last;
    }
}
