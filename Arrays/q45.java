/*
better Approach
3 Sum
Given an integer array nums. Return all triplets such that:
i != j, i != k, and j != k
nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets. One element can be a part of multiple triplets. The output and the triplets can be returned in any order.
Example 1:
Input: nums = [2, -2, 0, 3, -3, 5]
Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
Explanation:
nums[1] + nums[2] + nums[0] = 0
nums[4] + nums[1] + nums[5] = 0
nums[4] + nums[2] + nums[3] = 0
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * q44
 */
public class q45 {
     public static List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> st = new HashSet<>();
         for(int i = 0;i<nums.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i+1; j<nums.length;j++){
                int third = -(nums[i] + nums[j]);
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(
                        nums[i], nums[j], third
                    );
                    Collections.sort(temp);
                     st.add(temp);
                }
                hashset.add(nums[j]);
            }
            
         }
         return new ArrayList<>(st);
     }
    public static void main(String[] args) {
           int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}