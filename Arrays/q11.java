package Arrays;
/*
Union of two sorted arrays
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
*/
import java.util.ArrayList;

public class q11 {
      public static int[] unionArray(int[] nums1, int[] nums2) {
         int n1 = nums1.length;
         int n2 = nums2.length;
         int i = 0;
         int j = 0;
        ArrayList<Integer> Temp = new ArrayList<>();
         while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(Temp.size() == 0||Temp.get(Temp.size()-1)!=nums1[i]){
                    Temp.add(nums1[i]);
                }
                i++;
            }
            else{
               if(Temp.size() == 0||Temp.get(Temp.size()-1)!=nums2[j]){
                    Temp.add(nums2[j]);
                }
                j++;
            }
         }
         while(j < n2){
           if(Temp.size() == 0||Temp.get(Temp.size()-1)!=nums2[j]){
                    Temp.add(nums2[j]);
                }
                j++;
         }
           while(i < n1){
             if(Temp.size() == 0||Temp.get(Temp.size()-1)!=nums1[i]){
                    Temp.add(nums1[i]);
                }
                i++;
         }
         int[] arr = new int[Temp.size()];
        for(int k = 0;k<Temp.size();k++){
            arr[k] = Temp.get(k);
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};
        int[] result = unionArray(a, b);
        
        System.out.println("Union of two arrays:");

         for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
