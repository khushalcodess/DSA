/*
Better Approach
4 Sum
Given an integer array nums and an integer target. Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

a, b, c, d are all distinct valid indices of nums.
nums[a] + nums[b] + nums[c] + nums[d] == target.
Notice that the solution set must not contain duplicate quadruplets. One element can be a part of multiple quadruplets. The output and the quadruplets can be returned in any order.

Example 1:
Input: nums = [1, -2, 3, 5, 7, 9], target = 7

Output: [[-2, 1, 3, 5]]

Explanation:

nums[1] + nums[0] + nums[2] + nums[3] = 7
*/

package Arrays;

import java.util.*;

public class q48 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                Set<Long> hashset = new HashSet<>();

                for (int k = j + 1; k < nums.length; k++) {

                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum;

                    if (hashset.contains(fourth)) {

                        List<Integer> temp = Arrays.asList(
                            nums[i], nums[j], nums[k], (int) fourth
                        );

                        Collections.sort(temp);
                        st.add(temp);
                    }

                    hashset.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, 3, 5, 7, 9};
        int target = 7;

        List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);
    }
}
