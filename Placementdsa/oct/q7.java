/*
248. Move Zeros to End
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
This must be done in place, without making a copy of the array.
Example 1:
Input: nums = [0, 1, 4, 0, 5, 2]
Output: [1, 4, 5, 2, 0, 0]
Explanation:
Both the zeroes are moved to the end and the order of the other elements stay the same
*/

package Placementdsa.oct;

public class q7 {
    public static int[] movezeros(int[] num){
        int j = 0;
        for(int i=0; i<num.length;i++){
            if(num[i] != 0){
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
          j++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        
    }
}
