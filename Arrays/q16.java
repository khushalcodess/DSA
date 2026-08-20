/*
Single Number - I
Input : nums = [1, 2, 2, 4, 3, 1, 4]
Output : 3
Explanation : The integer 3 has appeared only once.
*/

package Arrays;

public class q16 {
    public static  int singleNumber(int[] nums) {
        int xor =0;

        for(int i = 0; i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};

        int answer = singleNumber(arr);

        System.out.println("Single Number = " + answer);
    }
}
