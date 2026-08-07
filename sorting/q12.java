/*
Left Rotate Array by One
Example 1

Input: nums = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

Explanation:

Initially, nums = [1, 2, 3, 4, 5]

Rotating once to left -> nums = [2, 3, 4, 5, 1]
*/
import java.util.*;

class q12 {

    public void rotateArrayByOne(int[] nums) {

        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {

        q12 obj = new q12();

        int[] nums = {1, 2, 3, 4, 5};

        obj.rotateArrayByOne(nums);

        System.out.println("Array after left rotation:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}