package blind75;

import java.util.stream.IntStream;
//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

public class RemoveElement {
    public static void main(String[] args) {
        
        int[] nums = {0,1,2,2,3,0,4,2};
        int numToRemove = 2;

        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==numToRemove){
                nums[i]=0;
                shiftArray(nums,i);
            }
        }

        IntStream.of(nums).forEach(System.out::print);
    }

    private static void shiftArray(int[] nums, int startIndex) {
        
        int temp;
        for(int i=startIndex;i<nums.length;i++){
           if(i+1<nums.length){
            temp = nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
           }
            
        }
    }
    
}
