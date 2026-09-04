public class ex {

    public int maxFrequency(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int sum = 0;
        int maxFrequency =0;

        for(int right = 0;right<n;right++){
            sum+=nums[right];

            while ((long) nums[right]*(right - left + 1) - sum > k) {
               sum-=nums[left] ;
               left++;
            }
            maxFrequency = Math.max(maxFrequency, right-left+1);

        }
        return maxFrequency;
    }
    public static void main(String[] args) {
        
    }
}
