/*
Bubble Sort
Example 1
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
*/
import java.util.*;
public class q2 {
     public int[] bubbleSort(int[] nums) {
       
        for(int i = nums.length - 1 ; i >= 0; i--){
            for(int j = 0 ; j<=i-1;j++){
               
                if(nums[j]>nums[j+1]){
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
                }
                 
            }
           
        }
        return nums;
    }
    public static void main(String[] args) {
        q2 obj = new q2();
        int[] nums = {3,2,6,4,9,8};
        System.out.println(obj.bubbleSort(nums));
    }
}
