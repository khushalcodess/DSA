/*
Move Zeros to End
Example 1

Input: nums = [0, 1, 4, 0, 5, 2]

Output: [1, 4, 5, 2, 0, 0]

Explanation:

Both the zeroes are moved to the end and the order of the other elements stay the same
*/
import java.util.Arrays;

public class q14 {
    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 0, 5, 2};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
