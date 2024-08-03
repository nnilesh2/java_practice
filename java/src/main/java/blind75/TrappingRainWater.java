package blind75;
//https://leetcode.com/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped
 */

public class TrappingRainWater {
    public static void main(String[] args) {
        
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left_p = 0;
        int right_p = heights.length-1;
        int left_max = heights[left_p];
        int right_max = heights[right_p];
        int trapped_water=0;

        while (left_p<right_p) {
            if(left_max<right_max){
                left_p++;
                left_max= Math.max(left_max, heights[left_p]);
                trapped_water = trapped_water + (left_max-heights[left_p]);
            }else{
                right_p--;
                right_max = Math.max(right_max, heights[right_p]);
                trapped_water=trapped_water+(right_max-heights[right_p]);
            }
        }

        System.out.println(trapped_water);
    }
}
