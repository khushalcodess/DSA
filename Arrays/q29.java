/*
Kadane's Algorithm
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.

Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation:
The subarray from index 0 to index 4 has the largest sum = 15

*/

public class q29 {

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            maxi = Math.max(maxi, sum);


            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 2, 3, -1, 2, -6, 5};

        int answer = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + answer);
    }
}