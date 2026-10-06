/* 
optimal approach
Two Sum
Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.

Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in any order.

Example 1:
Input: nums = [1, 6, 2, 10, 3], target = 7

Output: [0, 1]

Explanation:

nums[0] + nums[1] = 1 + 6 = 7
*/
package Placementdsa.oct;

import java.util.Arrays;

public class q3 {
     public static int[] twoSum(int[] nums, int target) {
        int i = 0 ; 
        int j = nums.length - 1;
        while (i<j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i,j};
            }         
            else if (sum>target) {
                j--;
            }   
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
                int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Answer: " + Arrays.toString(result));
    }
}
