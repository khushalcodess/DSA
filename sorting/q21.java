/*
Maximum Consecutive Ones
Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
*/
package sorting;

public class q21 {
   public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 ;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};

        int answer = findMaxConsecutiveOnes(arr);

        System.out.println("Consecutive = " + answer);
    }
}
