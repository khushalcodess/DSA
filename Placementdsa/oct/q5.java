/*
Missing Numbe
Question:
Given an array containing n distinct numbers from the range [0, n], find the only number missing from the array.
Input:
nums = [3, 0, 1]
Output:
2
*/
package Placementdsa.oct;

public class q5 {
      public static int missingnumber(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
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

        System.out.println(missingnumber(nums));
    }
}
