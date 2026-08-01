/*
Quick Sorting
Example 1

Input: nums = [7, 4, 1, 5, 3]

Output: [1, 3, 4, 5, 7]

Explanation: 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.
*/
package sorting;

import java.util.Arrays;

public class q7 {
    public int[] quicksort(int[] nums){
        int n = nums.length;
        quicksorthelper(nums,0,n-1);
        return nums;
    }
    public void quicksorthelper(int[] nums,int start,int end){
        if(start<end){
            int pivot = partition(nums,start,end);
            quicksorthelper(nums, start, pivot - 1);
            quicksorthelper(nums, pivot + 1, end);
        }
    }
    public int partition(int[] nums,int start,int end){
        int pivot = nums[end];
        int j = start - 1;
        for (int i = start; i < end; i++) {
            if (nums[i]<pivot) {
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]= temp;
            }
        }
        int tmep = nums[j +1];
        nums[j+1] = nums[end];
        nums[end] = tmep;

        return j +1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3};

        q7 obj = new q7();
        
        obj.quicksort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
