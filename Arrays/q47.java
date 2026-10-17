package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q47 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
       Set<List<Integer>> st = new HashSet<>();


        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                for( int k = j+1;k<nums.length;k++){
                    for(int l = k + 1;l<nums.length;l++){

                    
                    if((long)nums[i]+nums[j]+nums[k]+nums[l] == target){
                         List<Integer> temp = Arrays.asList(
                            nums[i], nums[j], nums[k],nums[l]
                        );

                        Collections.sort(temp);
                        st.add(temp);
                    }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
         int[] nums = {-1, -2, 3, 5, 7, 9};
        int target =7;
        List<List<Integer>> result = fourSum(nums,target);

        System.out.println(result);
    }
}
