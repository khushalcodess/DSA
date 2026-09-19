/*
Longest Consecutive Sequence in an Array
Given an array nums of n integers.
Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
Example 1
Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation:
The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.
*/
class Solution {

    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        int longest = 0;

       
        for (int i = 0; i < n; i++) {

            int x = nums[i];
            int count = 1;

            
            while (true) {

                boolean found = false;

                for (int j = 0; j < n; j++) {

                    if (nums[j] == x + 1) {
                        x = x + 1;
                        count++;
                        found = true;
                        break;
                    }
                }

              
                if (!found) {
                    break;
                }
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {100, 4, 200, 1, 3, 2};

        int ans = sol.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence: " + ans);
    }
}