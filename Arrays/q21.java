//Two Sum better approach
/*
Input: nums = [1, 6, 2, 10, 3], target = 7
Output: [0, 1]
Explanation:
nums[0] + nums[1] = 1 + 6 = 7
*/

import java.util.HashMap;

/**
 * q21
 */
public class q21 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<nums.length;i++){
                int needed = target -nums[i];
                if (map.containsKey(needed)) {
                    return new int[]{map.get(needed),i};                   
                }
                map.put(nums[i], i);
            }
            return new int[]{};
    }
    public static void main(String[] args) {
      int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;

        q20 obj = new q20();

        int[] result = obj.twoSum(nums, target);

        System.out.println("Two Sum Are :- [" + result[0] + ", " + result[1] + "]");
    }
}