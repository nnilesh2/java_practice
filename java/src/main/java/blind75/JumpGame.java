package blind75;

//https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150

/*
 You are given an integer array nums. You are initially positioned at the array's first index,
  and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = { 2,3,1,1,4 };

        System.out.print(reachedEnd(nums));

    }

    private static boolean reachedEnd(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

}
