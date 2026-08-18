/*
Find missing number
Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
*/
package sorting;

/**
 * q18
 */
public class q18 {
     public static  int missingNumber(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
   int[] nums = {3, 0, 1};

        int answer = missingNumber(nums);

        System.out.println("Missing number = " + answer);
    }
    
}