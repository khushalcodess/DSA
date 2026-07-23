//Counting Frequencies of Array Elements
/*
Example 1

Input: nums = [1, 2, 2, 1, 3]

Output: [[1, 2], [2, 2], [3, 1]]

Explanation:

- 1 appears 2 times

- 2 appears 2 times

- 3 appears 1 time

Order of output can vary.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q2 {

        public List<List<Integer>> countFrequencies(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3};
        q2 obj = new q2();
       System.out.println(obj.countFrequencies(arr));
    }
    
}