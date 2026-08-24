/*
optimal Approach
Longest subarray with sum K
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4
Explanation:
The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array
starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore,
the length of this sub-array is 4.
*/
import java.util.HashMap;

public class q19 {

    public static int longestSubarray(int[] nums, int k) {

        HashMap<Long, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0L, -1);

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // We need an earlier prefix sum = sum - k
            if (map.containsKey(sum - k)) {

                int len = i - map.get(sum - k);

                maxLen = Math.max(maxLen, len);
            }

            // Store only the FIRST occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int answer = longestSubarray(nums, k);

        System.out.println(answer);
    }
}