/*
Majority Element-I
Optimal Approach
Example 1

Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation:

The number 7 appears 5 times in the 9 sized array
*/
public class q26 {
      public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if( nums[i] == element){
                count++;

            }
            else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] == element){
                count1++;
            }
            if(count1 > nums.length/2){
                return element;
            }

        }
        return -1;
    }
        public static void main(String[] args) {

        q26 obj = new q26();

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int answer = obj.majorityElement(nums);

        System.out.println("Majority Element: " + answer);
    }
}
