/*
Selection Sort
Example 1
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
*/
package shorting;

public class q1 {
    public int[] selectionSort(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        q1 obj = new q1();
        int[] nums = {2,5,1,8,3};
         System.out.println(obj.selectionSort(nums));
    }
    
}