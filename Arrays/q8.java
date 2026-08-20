package Arrays;
/*
Linear Search
Input: nums = [2, 3, 4, 5, 3], target = 3
Output: 1
Explanation:
The first occurence of 3 in nums is at index 1
*/

public class q8 {

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, -4, 1};
        int target = 1;

        int result = linearSearch(nums, target);

        System.out.println("Index: " + result);
    }
}