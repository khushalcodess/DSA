/*
Leaders in an Array
Given an integer array nums, return a list of all the leaders in the array.
A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

Example 1
Input: nums = [1, 2, 5, 3, 1, 2]
Output: [5, 3, 2]
Explanation:
2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]
*/

import java.util.*;

public class q34 {

    // Brute Force Approach
    public static List<Integer> leaders(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] <= nums[j]) {
                    isLeader = false;
                    break;
                }
            }


            if (isLeader) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 3, 1, 2};

        List<Integer> ans = leaders(nums);

        System.out.println(ans);
    }
}