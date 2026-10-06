/* 
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
import java.util.HashMap;
import java.util.Map;

public class q2 {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> temp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int temp1 = target - nums[i];

            if (temp.containsKey(temp1)) {
                return new int[]{temp.get(temp1), i};
            }

            temp.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Answer: " + Arrays.toString(result));
    }
}