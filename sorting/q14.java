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
    public static void moveZeroes(int[] nums) {

        int zero = 0;
        int count = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero++;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }

        // Put zeroes at the end
        for (int k = nums.length - zero; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 4, 0, 5, 2};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
