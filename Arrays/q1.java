package Arrays;
/*
Largest Element
Given an array of integers nums, return the value of the largest element in the array
Example 1
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6
*/

import java.util.Arrays;

/**
 * q8
 */
public class q1 {
     public int largestElement(int[] nums) {
        int num = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            if(num<nums[i]){
                num = nums[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] nums = {3,3,6,1};
        q1 obj = new q1();
        obj.largestElement(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}