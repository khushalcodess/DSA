/*
Brute Approach
Longest subarray with sum K
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4
Explanation:
The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array
starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore,
the length of this sub-array is 4.
*/
package Arrays;

public class q17 {
     public static  int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        for (int i = 0 ; i<n ; i++){
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+=nums[j];
                if(sum == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
       return len;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int result = longestSubarray(arr, k);

        System.out.println("Longest subarray with sum K :-" +result);
    }
}
