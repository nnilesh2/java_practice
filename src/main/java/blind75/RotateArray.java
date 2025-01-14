package blind75;
//https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

/*
 Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        int nums_length = nums.length;

        for(int i=0;i<k;i++){
            int last_emeent = nums[nums_length-1];
            for(int j=nums_length-1;j>0;j--){
               nums[j]=nums[j-1];
            }
            nums[0]=last_emeent;
        }

        Arrays.stream(nums).forEach(System.out::print);
        
    }
}
