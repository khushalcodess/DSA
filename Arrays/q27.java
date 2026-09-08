/*
Brute Approach
Kadane's Algorithm
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1
Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15
Explanation:
The subarray from index 0 to index 4 has the largest sum = 15
*/
public class q27 {
    public int maxSubArray(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int sum = 0;
                for(int k = i ; k <= j; k++){
                    sum += nums[k];

                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
         q27 obj = new q27();

        int[] nums = {2, 3, 5, -2, 7, -4};

        int answer = obj.maxSubArray(nums);

        System.out.println("Max SubArray Is :- " + answer);
    }
}
