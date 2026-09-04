/*
Majority Element-I
Brute Force Approach
Example 1

Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation:

The number 7 appears 5 times in the 9 sized array
*/
class q24 {

    public int majorityElement(int[] nums) {

        int n = nums.length;


        for (int i = 0; i < n; i++) {

            int count = 0;


            for (int j = 0; j < n; j++) {

                if (nums[j] == nums[i]) {
                    count++;
                }
            }


            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }


    // Main method
    public static void main(String[] args) {

        q24 obj = new q24();

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int answer = obj.majorityElement(nums);

        System.out.println("Majority Element: " + answer);
    }
}