/*
Kadane's Algorithm better
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.

Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation:
The subarray from index 0 to index 4 has the largest sum = 15

*/

public class q50 {

     public static int maxSubArray(int[] nums) {
        int max  = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum+=nums[j];
                max =  Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 2, 3, -1, 2, -6, 5};

        int answer = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + answer);
    }
}