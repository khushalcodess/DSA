import java.util.HashSet;

/*
Contains Duplicate
Given an integer array nums, return true if any value appears at least twice, otherwise return false.
Input:
nums = [1, 2, 3, 1]
Output:
true
*/
public class q4 {
    public static boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i =  0;i<nums.length;i++){
            if (set.contains(nums[i])) {
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(duplicate(nums));
    }
}
