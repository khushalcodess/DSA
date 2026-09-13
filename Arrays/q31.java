/*
Brute Approach
Rearrange array elements by sign
Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:
Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Example 1
Input : nums = [2, 4, 5, -1, -3, -4]
Output : [2, -1, 4, -3, 5, -4]
Explanation:
The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
 */
public class q31 {

    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int positivecount = 0;
        int nagativecount = 0;

        int[] positive = new int[n / 2];
        int[] nagative = new int[n / 2];

        // Store positive and negative numbers separately
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                positive[positivecount] = nums[i];
                positivecount++;
            } 
            else {
                nagative[nagativecount] = nums[i];
                nagativecount++;
            }
        }

        // Put them alternatively
        for (int i = 0; i < n / 2; i++) {

            nums[i * 2] = positive[i];
            nums[i * 2 + 1] = nagative[i];
        }

        return nums;
    }

    public static void main(String[] args) {

        q31 obj = new q31();

        int[] nums = {3, 1, -2, -5, 2, -4};

        int[] result = obj.rearrangeArray(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}