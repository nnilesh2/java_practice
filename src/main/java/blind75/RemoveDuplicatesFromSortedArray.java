package blind75;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

/*
 Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, 
you must instead have the result be placed in the first part of the array nums. More formally, 
if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
  
 **/

 public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        
        int index = 2; // Start from the 3rd element in the array
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Compare current element with element at index-2
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

