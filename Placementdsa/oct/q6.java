package Placementdsa.oct;

public class q6 {
     public static int missingnumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for(int i =0;i<nums.length;i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ (i+1);
        }
        return xor1 ^ xor2;
     }
    public static void main(String[] args) {
        
    }
}
