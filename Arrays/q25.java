/*
Majority Element-I
better  Approach
Example 1

Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

Output: 7

Explanation:

The number 7 appears 5 times in the 9 sized array
*/
class q24 {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
       
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp = entry.getKey();
            int freq = entry.getValue();
            if(freq>nums.length/2){
                return temp;
            }
            
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {

        q24 obj = new q24();

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int answer = obj.majorityElement(nums);

        System.out.println("Majority Element: " + answer);
    }
}