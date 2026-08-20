package Arrays;
/*
Check if the Array is Sorted II
Example 1

Input : nums = [1, 2, 3, 4, 5]

Output : true

Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.
*/

import java.util.ArrayList;

public class q3 {

    public static boolean isSorted(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size() - 1; i++) {

            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(9);
        nums.add(6);
        nums.add(8);
        nums.add(5);
        nums.add(4);

        boolean result = isSorted(nums);

        System.out.println(result);
    }
}