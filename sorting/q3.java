package sorting;

public class q3 {
    public int[] insertionSort(int[] nums) {

        for(int i = 1; i < nums.length; i++) {

            int cur = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > cur) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = cur;
        }

        return nums;
    }
    public static void main(String[] args) {
        q3 obj = new q3();
        int[] nums = {3,2,7,4,9,5};
        System.err.println(obj.insertionSort(nums));
    }
}
