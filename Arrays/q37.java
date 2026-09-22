/*
Optimal approach
Longest Consecutive Sequence in an Array
Given an array nums of n integers.
Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
Example 1
Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation:
The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4. This sequence can be formed regardless of the initial order of the elements in the array.
*/
import java.util.HashSet;

class q37 {

    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        HashSet<Integer> st = new HashSet<>();

   
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        int longest = 1;

      
        for (int i = 0; i < n; i++) {

            int x = nums[i];

           
            if (!st.contains(x - 1)) {

                int cnt = 1;

               
                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(sol.longestConsecutive(nums));
    }
}