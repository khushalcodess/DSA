/*
Left Rotate Array by K Places
Input: nums = [1, 2, 3, 4, 5, 6], k = 2

Output: nums = [3, 4, 5, 6, 1, 2]

Explanation:

rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
*/
import java.util.*;

class Solution {

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n ;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = nums[i];
        }
        for(int i = k ; i < n ; i++ ){
            nums[i-k] = nums[i];
        }
        for(int i = n - k ; i < n ; i++ ){
            nums[i] = temp[i-(n - k)];
        }
    }


    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        int k = 4;

        obj.rotateArray(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}