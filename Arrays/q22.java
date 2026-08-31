/*
Sort an array of 0's 1's and 2's
Example 1
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation:
The nums array in sorted order has 2 zeroes, 2 ones and 1 two
*/

import java.util.Arrays;

class q22 {
    public void sortZeroOneTwo(int[] nums) {

        int a_count = 0;
        int b_count = 0;
        int c_count = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a_count++;
            }
            else if (nums[i] == 1) {
                b_count++;
            }
            else {
                c_count++;
            }
        }

    
        for (int i = 0; i < a_count; i++) {
            nums[i] = 0;
        }

    
        for (int i = a_count; i < a_count + b_count; i++) {
            nums[i] = 1;
        }

        
        for (int i = a_count + b_count; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
     public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 0};

        q22 obj = new q22();

        obj.sortZeroOneTwo(nums);

        System.out.println(Arrays.toString(nums));
    }
}