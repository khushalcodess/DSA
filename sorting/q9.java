/*
Second Largest Element
Example 1
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation:
The largest value in nums is 8, the second largest is 7
*/

public class q9 {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0] ;
        int seclargest = -1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i]>largest){
                seclargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>seclargest && nums[i]!=largest){
                seclargest = nums[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int[] num = {8, 8, 7, 6, 5};
        q9 obj = new q9();
        System.err.println("Second largest number is :-"+obj.secondLargestElement(num));
    }
}