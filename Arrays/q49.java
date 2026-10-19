/*
Optimal Approach
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

public class q49 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
      Set<List<Integer>> st = new HashSet<>();
      for(int i = 0;i<nums.length;i++){
        
        if(i>0 && nums[i] == nums[i-1]) continue;
        for(int j = i +1;j<nums.length;j++){
            if(j != i && nums[j] == nums[j-1])continue;
        int k = j + 1;
        int l = nums.length - 1;
        while(k<l){
           int sum = nums[i] + nums[j] + nums[k] + nums[l];

            if(sum < target){
                k++;
            }
            else if(sum>target){
                l--;
            }
            else{
                 List<Integer> temp = Arrays.asList(
                        nums[i], nums[j], nums[k],nums[l]
                    );
            st.add(temp);
            k++;
            l--;
            while(k<l && nums[k] == nums[k-1]){
                k++;
            }
            while(k<l && nums[l] == nums[l+1]){
                l--;
            }
            }
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
