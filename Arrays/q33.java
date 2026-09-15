/*
Optimal Approach
Next Permutation
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integers.
More formally, if all the permutations of the array are sorted in lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted order.
If such arrangement is not possible (i.e., the array is the last permutation), then rearrange it to the lowest possible order (i.e., sorted in ascending order).
You must rearrange the numbers in-place and use only constant extra memory.

Example 1

Input: nums = [1,2,3]
Output: [1,3,2]
Explanation:
The next permutation of [1,2,3] is [1,3,2].
*/

import java.util.*;

class q33 {

    public static void nextPermutation(int[] nums) {

        int n = nums.length;

        int index = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

    
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

    
        for (int i = n - 1; i > index; i--) {

            if (nums[i] > nums[index]) {

                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index + 1, n - 1);
    }

    // Swap two elements
    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse array from left to right
    public static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            swap(nums, left, right);

            left++;
            right--;
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}