/*
optimal
Sort an array of 0's 1's and 2's
Example 1
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation:
The nums array in sorted order has 2 zeroes, 2 ones and 1 two
*/

import java.util.Arrays;

public class q23 {
    public void sortZeroOneTwo(int[] nums) {
        int starts = 0;
        int mid = 0;
        int n = nums.length;
        int end = n-1;
        int temp;
        while (mid<=end) {
            if(nums[mid] == 0){
               temp = nums[starts];
               nums[starts] = nums[mid];
               nums[mid] = temp;
               temp = 0;
               starts++;
               mid++;
            }           
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid] == 2){
                temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                temp = 0;
                end--;
            }

        }
       
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 0};

        q23 obj = new q23();

        obj.sortZeroOneTwo(nums);

        System.out.println(Arrays.toString(nums));
    }
}
