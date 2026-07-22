//Hash array1 3 2 1 3

import java.util.Scanner;

public class q1 {
    public void hashing( int[] nums){
        Scanner sc = new Scanner(System.in);

        int n = nums.length;
        int[] Hash = new int[13];
        for(int i = 0; i<n; i++){
            Hash[nums[i]]++;
        }
         int q = sc.nextInt();

        while (q-- > 0) {
            int number = sc.nextInt();

            // Fetch
            System.out.println(Hash[number]);
        }

    }
    public static void main(String[] args) {
        q1 obj = new q1();
        int[] nums = {1,3,2,1,3};
        obj.hashing(nums);
    }
}