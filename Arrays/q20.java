//Two Sum
/*
Input: nums = [1, 6, 2, 10, 3], target = 7
Output: [0, 1]
Explanation:
nums[0] + nums[1] = 1 + 6 = 7
*/
public class q20 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;

        q20 obj = new q20();

        int[] result = obj.twoSum(nums, target);

        System.out.println("Two Sum Are :- [" + result[0] + ", " + result[1] + "]");
    }
}