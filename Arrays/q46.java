import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q46 {
      public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if (i>0 && nums[i] == nums[i-1]) continue;
            int j = i +1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(
                        nums[i], nums[j], nums[k]
                    );

                    st.add(temp);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]) {
                        j++;                     
                    }
                    while (j<k && nums[k] == nums[k+1]) {
                        k--;                      
                    }
                }
            }
        }
        return new ArrayList<>(st);
      }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}
